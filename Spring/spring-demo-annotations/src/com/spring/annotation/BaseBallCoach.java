package com.spring.annotation;

import org.springframework.stereotype.Component;

//Add component annotation to Java Class
//Spring will automatically register this bean
@Component("theBaseBallCoach")
public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Play BeseBall daily for 30 mins....";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
