package com.sergio.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return"Run a hard 5k";
	}

	public String getDailyFortune() {
		
		return "Running " + fortuneService.getFortune();
	}

}
