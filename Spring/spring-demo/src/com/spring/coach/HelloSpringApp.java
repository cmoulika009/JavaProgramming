package com.spring.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. load the configuration file, creating Spring Container
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

		// 3. retrieve bean from container

		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		// 4. call methods on bean
		
		System.out.println(theCoach.getDailyWorkout());

		// 5. close xml
		context.close();
	}

}
