package com.sergio.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	
		//read config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//call method on the bean
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\npointing to the same object = " + result);
		System.out.println("the coach Memory location:" + theCoach);
		System.out.println("the coach Memory location:" + alphaCoach);
		
		//close bean
		context.close();

	}

}
