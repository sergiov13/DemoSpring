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
	
	//add and init method
	public void doMyStartup() {
		System.out.println("TracCoach inside method do my startup Stuff");
	}
	//add destroy method
	public void doMyCleanup() {
		System.out.println("Trackcoach inside method do my cleanup");
	}
}
