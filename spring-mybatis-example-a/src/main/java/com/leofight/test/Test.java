package com.leofight.test;

import com.leofight.app.App;
import com.leofight.services.X;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: fly
 * @create: 2020-08-02 17:25
 **/

public class Test {
	public static void main(String[] args) {
		//初始化Spring容器
		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(App.class);
		System.out.println(a.getBean(X.class));
	}
}
