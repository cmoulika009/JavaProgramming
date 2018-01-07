package com.spring.dependency.injection;

import java.util.Random;

//2. Define class that implements interface

public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Happy Holidays!!!!";
	}

	private Random myRandom = new Random();

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		String arr[] = { "Have a great day", "Happy Sunday", "Hello Beauty" };
		int index = myRandom.nextInt(arr.length);
		String randomFortune = arr[index];
		return randomFortune;
	}
}
