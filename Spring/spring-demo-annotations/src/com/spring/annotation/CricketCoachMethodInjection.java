package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Add component annotation to Java Class which generates default bean 
//Spring will automatically register this bean
@Component
public class CricketCoachMethodInjection implements Coach {

	private FortuneService fortuneService;

	// Create any method for injection
	// Configure dependency injection
	@Autowired
	public void doCricketCoach(FortuneService fortuneService) {
		System.out.println("In the Method....");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play daily for 30 mins....";
	}

	// This method is used to implenent dependency method
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
