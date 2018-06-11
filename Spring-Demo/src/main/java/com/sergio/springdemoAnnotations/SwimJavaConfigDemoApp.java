package com.sergio.springdemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get fortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("the team is: " + theCoach.getTeam());
		System.out.println("the email is: "+ theCoach.getEmail());
		
		
		//close bean
		context.close();
	}

}
