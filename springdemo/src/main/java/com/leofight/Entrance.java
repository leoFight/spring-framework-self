package com.leofight;

import com.leofight.controller.WelcomeController;
import com.leofight.entity.User;
import com.leofight.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: fly
 * @create: 2020-06-21 16:59
 **/
@Configuration
@ComponentScan("com.leofight")
public class Entrance {
	public static void main1(String[] args) {
		System.out.println("Hello World!");

		String xmlPath = "/spring/spring-config.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("强大的Spring框架");
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName: beanDefinitionNames){
			System.out.println(beanDefinitionName);
		}
		WelcomeController welcomeController = (WelcomeController) context.getBean("welcomeController");
		welcomeController.handleRequest();

		User user5 = (User) context.getBean("user5");
		System.out.println(user5);
	}
}
