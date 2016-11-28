package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do it: "+fortuneService.getFortune();
	}
	
	//For init-method "Initial" 
	public void myInitialMethod(){
		System.out.println("Riching A Init-method...");
	}
	//For destroy-method "Destroyed"
	public void myDestroyMethod(){
		System.out.println("Riching A Destroy-method...");
	}
}
