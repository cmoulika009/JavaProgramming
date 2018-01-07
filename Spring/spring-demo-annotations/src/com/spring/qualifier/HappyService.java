package com.spring.qualifier;

import org.springframework.stereotype.Component;

//Add component annotation to Java Class which generates default bean for this class
@Component
public class HappyService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your best play";
	}

}
