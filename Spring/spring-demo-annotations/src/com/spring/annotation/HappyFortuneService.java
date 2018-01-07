package com.spring.annotation;

import org.springframework.stereotype.Component;

//Add component annotation to Java Class which generates default bean for this class
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}
