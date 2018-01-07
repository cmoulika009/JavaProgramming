package com.spring.dependency.injection;

public class CricketCoach implements Coach {
	// define private field for dependency
	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;

	// no-arg constructor
	public CricketCoach() {
		System.out.println("Inside Default Constructor");
	}

	// 1. Create setter method in class for injections
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play Cricket for 30 mins....";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}
}
