package com.devworld.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same object: " + result);
		System.out.println("\nMemory location for coach: " + theCoach);
		System.out.println("\nMemory location for coach: " + alphaCoach + "\n");
		
		context.close();

	}

}
