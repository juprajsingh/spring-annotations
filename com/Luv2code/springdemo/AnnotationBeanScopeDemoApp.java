package com.Luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach " + theCoach);
		System.out.println("\nMemory Location for alphaCoach" + alphaCoach + "\n");
		
		// close context
		context.close();
	}

}
