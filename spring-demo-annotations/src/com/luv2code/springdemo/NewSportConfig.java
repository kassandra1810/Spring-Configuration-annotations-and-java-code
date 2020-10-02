package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewSportConfig {
	
	@Bean
	public FortuneService hardCodeFortuneService() {
		return new HardCodeFortuneService();
	}
	
	@Bean
	public Coach baseballCoach() {
		return new BaseballCoach(hardCodeFortuneService());
	}

}
