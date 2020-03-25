package com.example.demo;

import cn.hutool.http.HttpUtil;
import com.sun.deploy.net.HttpUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class MySpringBootApplicationTests {

	@Test
	void contextLoads() {
		String url = "https://api.253.com/open/notify/voice-notify";
		Map<String, Object> params = new HashMap<>();

		params.put("appId","Oqlxlvls");
		params.put("appKey","26n03ss5");
		params.put("mobile","17875433390");
		params.put("templateId","2653");
		String post = HttpUtil.post(url, params);
		System.out.println(post);
	}

}
