package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Add component annotation to Java Class which generates default bean 
//Spring will automatically register this bean
@Component
public class BaseBallCoachDefaultBeanId implements Coach {

	private FortuneService fortuneService;

	// Using Constructor Injection we are configuring dependency injection
	@Autowired
	public BaseBallCoachDefaultBeanId(FortuneService fortuneService) {
		System.out.println("In Constructor Injection");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play BeseBall daily for 10 mins....";
	}

	// This method is used to implenent dependency method
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
