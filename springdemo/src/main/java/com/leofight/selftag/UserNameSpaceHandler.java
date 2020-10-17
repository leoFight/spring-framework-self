package com.leofight.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author: fly
 * @create: 2020-10-17 21:12
 **/

public class UserNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
	}
}
