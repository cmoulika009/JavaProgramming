package com.spring.java.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration: Tell spring that this is java annotation
//@ComponentScan: exactly same as XML component scan which scans the specified package
//@PropertySource: loads the properties file into Spring Config
@Configuration
//@ComponentScan("com.spring.java.annotation")
@PropertySource("classpath:sports.properties")
public class SportConfig {

	// Define method which is used further for dependency injection
	@Bean
	public FortuneService happyService() {
		return new HappyService();
	}

	// Inject dependencies to method which creates bean for actual class
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(happyService());
	}
}
