package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	public static void main(String args []){
		
		//load configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retrieve bean from Spring Container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
			
		System.out.println("theCoach : " +theCoach.getDailyFortune());
		
		//close Application Context
		context.close();
	}
}
