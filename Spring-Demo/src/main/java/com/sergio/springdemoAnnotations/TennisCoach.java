package com.sergio.springdemoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	public String getDailyWorkout() {
		
		return "Practice backhand volley";
	}

}
