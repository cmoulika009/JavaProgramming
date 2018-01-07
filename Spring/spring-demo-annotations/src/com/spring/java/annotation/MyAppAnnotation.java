package com.spring.java.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAppAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve bean from container
		// bean id is automatically generated same as class name
		Coach theCoach = context.getBean("cricketCoachFieldInjection", Coach.class);

		// the bean id is same that is used at @Component annotation
		// Coach theCoach = context.getBean("theBaseBallCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		context.close();
	}

}
