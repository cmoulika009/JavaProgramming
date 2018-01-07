package com.spring.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanScopeAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextQualifier.xml");
		
		Coach theCoach = context.getBean("cricketCoachQualifier", Coach.class);

		Coach theCoach2 = context.getBean("cricketCoachQualifier", Coach.class);
		
		boolean result=(theCoach==theCoach2);
		
		System.out.println("Bean Scope Result:" + result);
		System.out.println("Memory Location obj1:"+theCoach+" obj2:"+theCoach2);
		
		context.close();

	}

}
