package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
		//define a private field for the dependency
		private FortuneService fortuneService;
	
		// define a constructor for Dependency injection
		
		public BaseballCoach(FortuneService theFortuneService) {
			
			fortuneService = theFortuneService;
		}
		
		
		
		@Override
		public String getDailyWorkout(){
			return "Spend 30 minutes on batting Practice";
			
		}

		@Override
		public String getDailyFortune() {
			
			//use my FortuneService to get a fortune
			return fortuneService.getFortune();
		}
}
