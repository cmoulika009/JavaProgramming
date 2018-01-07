package com.spring.java.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Add component annotation to Java Class which generates default bean 
//Spring will automatically register this bean
@Component
public class CricketCoachFieldInjection implements Coach {

	// Spring automatically injects dependency value to respective field
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Play Cricket in Field daily for 30 mins....";
	}

	// This method is used to implement dependency method
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
