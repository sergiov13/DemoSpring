package com.sergio.springdemoAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("RandomService")
public class RandomService implements FortuneService {

	
	//create an array of strings
	private String[] data = {
			"Beware of the in sheep´s clothe",
			"Diligence is the mother of good luck",
			"The journey is the way"
	};
	
	private Random myRandom = new Random();
	
	
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
