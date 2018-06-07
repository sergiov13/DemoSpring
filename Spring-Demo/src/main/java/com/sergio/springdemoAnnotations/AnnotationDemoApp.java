package com.sergio.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation");
		
		
		//get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//close bean
		context.close();
	}

}
