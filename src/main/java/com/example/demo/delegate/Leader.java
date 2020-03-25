package com.example.demo.delegate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:16:03
 */
public class Leader implements IExecutor {


    private static Map<String, IExecutor> map =new HashMap<String,IExecutor>();

    static {
        map.put("1", new Laji());
        map.put("2", new GC());
    }


    @Override
    public void doSomething(String param) {
        IExecutor o = map.get(param);
        o.doSomething(param);
    }
}
