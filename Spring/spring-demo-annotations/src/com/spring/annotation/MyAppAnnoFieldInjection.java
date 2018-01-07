package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppAnnoFieldInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the configuration file, creating Spring Container

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from container
		//bean id is automatically generated same as class name
		Coach theCoach = context.getBean("cricketCoachFieldInjection", Coach.class);

		// the bean id is same that is used at @Component annotation
		//Coach theCoach = context.getBean("theBaseBallCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
