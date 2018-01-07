package com.spring.dependency.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the configuration file, creating Spring Container

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycleContext.xml");

		// retrieve bean from container

		Coach theCoach = context.getBean("myGolfCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		context.close();
	}

}
