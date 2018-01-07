package com.spring.qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Add component annotation to Java Class which generates default bean 
//Spring will automatically register this bean
//@Scope: represents the bean scope either singleton/prototype
@Component
@Scope("singleton")
public class CricketCoachQualifier implements Coach {

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

	// define init-method
	@PostConstruct
	public void doinitMethod() {
		System.out.println("You are in init-method");
	}

	// define destroy method
	@PreDestroy
	public void doDestroyMethod() {
		System.out.println("You are in destroy-method");
	}

}
