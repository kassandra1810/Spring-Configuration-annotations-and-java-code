package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class RunCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	public RunCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run as far as you can";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
