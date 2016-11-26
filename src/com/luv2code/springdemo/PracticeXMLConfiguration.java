package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeXMLConfiguration {

	public static void main(String[] args) {
		
		//Load the Spring configuration file
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrieve bean from spring container
				
				Coach newCoach =  context.getBean("newCoach", Coach.class);
				
				//call methods on the bean
				System.out.println(newCoach.getDailyWorkout());
								
				//close the context
				context.close();
		
		

	}

}
