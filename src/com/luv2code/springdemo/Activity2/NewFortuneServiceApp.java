package com.luv2code.springdemo.Activity2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewFortuneServiceApp {

		public static void main(String agrs[]){
			
			//load the Spring configuration file
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			//retrieve bean from spring container
			CoachImpl theCaoch = context.getBean("newImplCoach", CoachImpl.class);
			//call methods on the bean
			System.out.println(theCaoch.getDailyWorkout());
			System.out.println(theCaoch.getDailyFortune());
			System.out.println(theCaoch.getFortuneService().getFortune());
			//close the context
			context.close();
		}
}
