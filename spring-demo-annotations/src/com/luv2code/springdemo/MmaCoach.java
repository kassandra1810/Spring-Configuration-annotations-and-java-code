package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MmaCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public MmaCoach () {
	}
	
	@Autowired
	public MmaCoach (@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "3 hours BJJ and 3 hours SPAS";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


}
