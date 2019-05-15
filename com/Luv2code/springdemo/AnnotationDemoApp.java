package com.Luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
		
		
	}

}
