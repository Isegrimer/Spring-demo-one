package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String args []){
		
		//load configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from Spring Container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same Bean
		boolean resultCompare = (theCoach == alphaCoach);
		
		System.out.println("Result from bean : "+ resultCompare);
		
		System.out.println("theCoach : " +theCoach);
		System.out.println("alphaCoach : " + alphaCoach);
		
		//close Application Context
		context.close();
	}
}
