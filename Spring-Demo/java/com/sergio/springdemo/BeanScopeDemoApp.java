package com.sergio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationConext.xml");
		
		//retrieve beans
		//Singleton
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory Location for theCoach: " + theCoach);
		
		System.out.println("\nMemory Location for alphaCoach: " + alphaCoach + "\n");
		// close beans
		
		context.close();
	}

}
