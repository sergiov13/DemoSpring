package com.sergio.springdemoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {		
		return "today is your lucky day";
	}

}
