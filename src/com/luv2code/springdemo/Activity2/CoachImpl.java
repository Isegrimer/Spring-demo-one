package com.luv2code.springdemo.Activity2;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class CoachImpl implements Coach {

	private FortuneService fortuneService;
	
	
	public CoachImpl(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}


	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Learn  Spring Every Day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You will get a better Job with Spring and Hibernet!";
	}

}
