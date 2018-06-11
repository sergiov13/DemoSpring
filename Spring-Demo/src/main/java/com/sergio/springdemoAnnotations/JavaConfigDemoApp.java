package com.sergio.springdemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close bean
		context.close();
	}

}
