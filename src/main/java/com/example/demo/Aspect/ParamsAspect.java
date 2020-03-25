package com.example.demo.Aspect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.demo.annotation.Check;
import com.example.demo.exception.CommonException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;


/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/6
 * Time:17:15
 */
@Component
@Aspect
public class ParamsAspect {
    private static final Logger logger = LoggerFactory.getLogger(ParamsAspect.class);

    @Pointcut("@annotation(com.example.demo.annotation.Check)")
    public void paramsCheck() {
    }

    @Around("paramsCheck()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 1、记录方法开始执行的时间
        long start = System.currentTimeMillis();


        // 打印请求参数
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        // 全路径类名
        String declaringTypeName = joinPoint.getSignature().getDeclaringTypeName();
        //类名截取
        String className = declaringTypeName.substring(declaringTypeName.lastIndexOf(".") + 1, declaringTypeName.length());
        //获取方法名
        String method = joinPoint.getSignature().getName();
        Map<String, String> params = getAllRequestParam(request);                    // 获取请求参数
        logger.info("{}.{} 接收参数: {}", className, method, JSON.toJSONString(params));


        // 开始处理注解
        Check check = ((MethodSignature) joinPoint.getSignature()).getMethod().getAnnotation(Check.class);
        String[] requiredFields = check.params();

        // 3、必填参数非空校验
        Boolean result = validParams(params, requiredFields);

        if (result){
            Object object = joinPoint.proceed();        // 必填参数非空校验通过，执行方法，获取执行结果
            // 4、打印应答数据和方法耗时
            long time = System.currentTimeMillis() - start;
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            logger.info("{}.{} 应答数据: {}; 耗时 {} ms", className, method, JSONObject.toJSONStringWithDateFormat(object,
                    dateFormat, SerializerFeature.WriteMapNullValue), time);
            return object;
        }else{
            throw new CommonException(501,"参数有误");
        }
    }

    private Boolean validParams(Map<String, String> params, String[] requiredFields) {
        if (requiredFields.length == 0) {
            return true;
        }
        for (String field : requiredFields) {
            if (StringUtils.isEmpty(params.get(field))) {
                return false;
            }
        }
        return true;
    }

    private Map<String, String> getAllRequestParam(HttpServletRequest request) {
        Map<String, String> res = new HashMap<>();
        Enumeration<String> parameterNames = request.getParameterNames();
        if (null != parameterNames) {
            while (parameterNames.hasMoreElements()) {
                String name = parameterNames.nextElement();
                String value = request.getParameter(name);
                res.put(name, value);
                // 在报文上送时，如果字段的值为空，则不上送<下面的处理为在获取所有参数数据时，判断若值为空，则删除这个字段>
                if (StringUtils.isEmpty(res.get(name))) {
                    res.remove(name);
                }
            }
        }
        return res;
    }

}
