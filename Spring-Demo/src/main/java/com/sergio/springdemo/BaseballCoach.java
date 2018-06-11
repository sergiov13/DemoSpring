package com.sergio.springdemo;

public class BaseballCoach implements Coach{
	
	
	//define a private field
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	public String getDailyFortune() {
		//use fortune to get fortune
		
		
	return fortuneService.getFortune();
	}
	
	//Test
	
	//Test2
}
