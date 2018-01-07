package com.spring.qualifier;

import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
