package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FreedivingCoach implements Coach {
	
	@Autowired
	@Qualifier("fileReadFortuneService")
	private FortuneService theFortuneService;
	
	public FreedivingCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "100 meters CNF";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}

}
