package com.spring.qualifier;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	//Create Random number genrator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String arr[] = { "Have a great day", "Happy Sunday", "Hello Beauty" };
		int index = myRandom.nextInt(arr.length);
		String randomFortune = arr[index];
		return randomFortune;

	}

}
