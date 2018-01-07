package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Add component annotation to Java Class which generates default bean 
//Spring will automatically register this bean
@Component
public class CricketCoachSetterInjection implements Coach {

	private FortuneService fortuneService;

	// Create Setter methods for injection
	// Configure dependency injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In the Setter Method....");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play Cricket daily for 30 mins....";
	}

	// This method is used to implenent dependency method
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
