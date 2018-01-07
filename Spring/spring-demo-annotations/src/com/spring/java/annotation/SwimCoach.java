package com.spring.java.annotation;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	// Reference values from properties file
	@Value("${email}")
	private String emailId;

	@Value("${team}")
	private String teamName;

	public SwimCoach() {
		System.out.println("Default Constructor");
	}

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "You need to Swim for 2 hrs";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmailId() {
		return emailId;
	}

	public String getTeamName() {
		return teamName;
	}

}
