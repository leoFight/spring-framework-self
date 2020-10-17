package com.leofight;

import com.leofight.controller.HelloController;
import com.leofight.controller.HiController;
import com.leofight.controller.WelcomeController;
import com.leofight.selftag.User;
import com.leofight.service.HelloService;
import com.leofight.service.HiService;
import com.leofight.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: fly
 * @create: 2020-06-21 16:59
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.leofight")
public class Entrance {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String xmlPath = "/spring/spring-config.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		//welcomeService.sayHello("强大的Spring框架");
		User user = (User) applicationContext.getBean("my");
		System.out.println(user.getUsername());
	}

	public static void main2(String[] args) {
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

	public static void main3(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		HiController hiController = (HiController)applicationContext.getBean("hiController");
		hiController.handleRequest();
		System.out.println("---------------------------分割线以下执行HelloService-------------------------------");
		HelloController helloController = (HelloController)applicationContext.getBean("helloController");
		helloController.handleRequest();
	}
}
