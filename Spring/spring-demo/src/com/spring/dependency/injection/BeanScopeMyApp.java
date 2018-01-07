package com.spring.dependency.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the configuration file, creating Spring Container

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");

		// retrieve bean from container

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myCoach", Coach.class);

		// check if both are same
		boolean result = (theCoach == theCoach2);

		System.out.println("Bean Scope Result:" + result);
		System.out.println("Memory Location obj1:"+theCoach+" obj2:"+theCoach2);
		
		context.close();
	}

}
