package com.spring.java.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAppAnnotationJavaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve bean from container
		//bean id is defined in SportConfig.java
		Coach theCoach = context.getBean("swimCoach", Coach.class);

		// the bean id is same that is used at @Component annotation
		// Coach theCoach = context.getBean("theBaseBallCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		
		SwimCoach theCoachLiterals = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(theCoachLiterals.getDailyWorkout());
		System.out.println(theCoachLiterals.getDailyFortune());
		System.out.println(theCoachLiterals.getEmailId());
		System.out.println(theCoachLiterals.getTeamName());

		context.close();
	}

}
