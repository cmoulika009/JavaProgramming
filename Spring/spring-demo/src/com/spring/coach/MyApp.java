package com.spring.coach;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Generic Inteface which is implemented by Baseball
		//But this way is not configurable, as still we are changing the class names
		Coach coach = new BaseBallCoach();

		System.out.println(coach.getDailyWorkout());
	}

}
