package com.leofight.service.impl;

import com.leofight.service.WelcomeService;
import org.springframework.stereotype.Service;

/**
 * @author: fly
 * @create: 2020-06-21 17:02
 **/
@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你：" + name);
		return "success";
	}
}
