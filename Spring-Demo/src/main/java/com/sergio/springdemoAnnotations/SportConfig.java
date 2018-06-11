package com.sergio.springdemoAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//Package from which it is going to search the beans
//@ComponentScan("com.sergio.springdemoAnnotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for sad Fortune service
	@Bean
	//Method name sadFortuneService is the bean name
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	//calling the method above
	//this is the name to call when creating it in main
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
	//define bean for swim coach inject dependencies
	
	
}
