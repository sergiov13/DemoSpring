package com.sergio.springdemoAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	
	@Autowired
	@Qualifier("RandomService")
	private FortuneService fortuneService;
	
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	
	@PostConstruct
	public void doMyStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartUpStuff");
	}
	
	@PreDestroy
	public void doCleanUp() {
		System.out.println(">> TennisCoach: inside cleanup");
	}
//	
//	//define a setter method 
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService");
//		fortuneService = theFortuneService;
//	}
//	
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
		fortuneService = theFortuneService;
	}

	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune()	;
	}

}
