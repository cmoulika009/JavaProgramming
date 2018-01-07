package com.spring.qualifier;

//Refactoring Code: Common method used
public interface Coach {
	public String getDailyWorkout();
	
	//This method is used to call dependency method
	public String getDailyFortune();
}
