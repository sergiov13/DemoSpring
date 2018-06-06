package com.sergio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
			
		//load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from containr
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methonds on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call new methodo for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
		
	}

}
