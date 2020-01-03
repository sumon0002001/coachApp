package com.rawshan.spring;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}

	public CricketCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Batting and Bowling practice on the field.";
	}

	@Override
	public String getDailyFortune() {
		
		return "Yeo Yeo " + fortuneService.getFortune();
	}

}
