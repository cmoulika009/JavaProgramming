package com.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Add component annotation to Java Class which generates default bean 
//Spring will automatically register this bean
@Component
public class SwimCoachQualifierLiterals implements Coach {

	@Value("${email}")
	private String emailId;

	@Value("${team}")
	private String teamName;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	// Spring automatically injects dependency value to respective field
	@Autowired
	// As there are multiple methods that implements FortuneService
	// using Qualifier we need to specify exact class that needs to be injected
	// here we used default bean id
	@Qualifier("randomService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Play Cricket with experienced players";
	}

	// This method is used to implenent dependency method
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
