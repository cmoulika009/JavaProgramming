package com.spring.dependency.injection;

public class BaseBallCoach implements Coach {

	// define private field for dependency
	private FortuneService myFortuneService;

	@Override
	public String getDailyWorkout() {
		return "Workout daily for 30 mins....";
	}

	// 3. Create constructor for injections
	public BaseBallCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}

	@Override
	public String getFortune() {
		// Use myFortuneService to get Fortune
		return myFortuneService.getFortune();
	}
}
