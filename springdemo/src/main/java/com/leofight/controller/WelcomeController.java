package com.leofight.controller;

import com.leofight.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: fly
 * @create: 2020-07-27 07:08
 **/
@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest(){
		welcomeService.sayHello("来自Controller的问候");
	}
}
