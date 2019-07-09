package com.devworld.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 8 laps";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it ohhhhh yaaaa- " + fortuneService.getFortune();
	}
	
	public void doMyInitStuff() {
		System.out.println("Do my startup stuff for track coach - ohhhh yaa");
	}
	
	public void doMyDestroyStuff() {
		System.out.println("Do my destroy stuff for track coach");
	}

}
