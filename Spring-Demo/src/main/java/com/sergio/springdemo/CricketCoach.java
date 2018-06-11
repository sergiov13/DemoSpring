package com.sergio.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email;
	
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {

		return team;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoah: Email");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoah: Team");
		this.team = team;
	}

	// create a no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoah: inside setter method - setfortservc");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
