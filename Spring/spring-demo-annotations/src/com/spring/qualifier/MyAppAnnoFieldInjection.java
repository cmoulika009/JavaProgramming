package com.spring.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppAnnoFieldInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the configuration file, creating Spring Container

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextQualifier.xml");

		// retrieve bean from container
		// bean id is automatically generated same as class name
		Coach theCoach = context.getBean("cricketCoachQualifier", Coach.class);

		// the bean id is same that is used at @Component annotation
		// Coach theCoach = context.getBean("theBaseBallCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		Coach theCoachCons = context.getBean("baseBallCoachConsQualifier", Coach.class);
		System.out.println(theCoachCons.getDailyWorkout());
		System.out.println(theCoachCons.getDailyFortune());

		//Get Literal Values
		SwimCoachQualifierLiterals theCoachSwim = context.getBean("swimCoachQualifierLiterals",
				SwimCoachQualifierLiterals.class);
		System.out.println(theCoachSwim.getDailyWorkout());
		System.out.println(theCoachSwim.getDailyFortune());
		System.out.println(theCoachSwim.getEmailId());
		System.out.println(theCoachSwim.getTeamName());

		context.close();
	}

}
