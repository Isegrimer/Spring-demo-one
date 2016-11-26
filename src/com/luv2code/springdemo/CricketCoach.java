package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new field for  emailAddress and Team
	
	private String emailAddress;
	private String team;	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach :  inside setter method - setEmailAddress");
		
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}
	

	public void setTeam(String team) {
		System.out.println("CricketCoach :  inside setter method - setTeam");
		
		this.team = team;
	}

	//non arguments constructor
	public CricketCoach() {
		System.out.println("CricketCoach :  inside no-arg constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach :  inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practice Fast Boeling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
