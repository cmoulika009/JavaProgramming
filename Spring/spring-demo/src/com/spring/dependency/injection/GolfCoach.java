package com.spring.dependency.injection;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;

	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice gold daily for 5 hrs....";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getRandomFortune();
	}
	
	//declare init method
	public void getStartupStuff(){
		System.out.println("Welcome to startup method");
	}
	
	//declare destroy method
	public void getStopStuff(){
		System.out.println("Bye this is stop method");
	}

}
