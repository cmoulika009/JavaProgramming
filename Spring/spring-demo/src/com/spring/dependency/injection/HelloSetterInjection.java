package com.spring.dependency.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSetterInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the configuration file, creating Spring Container

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

		// retrieve bean from container

		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods on bean

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getFortune());

		// Print Literal Values
		System.out.println(theCoach.getTeamName());
		System.out.println(theCoach.getEmailAddress());

		System.out.println("------Golf Coach-----");
		Coach theGolfCoach = context.getBean("myGolfCoach", GolfCoach.class);
		System.out.println(theGolfCoach.getDailyWorkout());
		System.out.println(theGolfCoach.getFortune());

		// close xml
		context.close();
	}

}
