package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach mmaCoach = context.getBean("mmaCoach", Coach.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		Coach freeCoach = context.getBean("freedivingCoach", Coach.class);
		
		// call a method on the bean
		//System.out.println(theCoach.getDailyWorkout());
		//System.out.println(mmaCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println(mmaCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println("email: " + swimCoach.getEmail());
		System.out.println("team: " + swimCoach.getTeam());
		System.out.println(freeCoach.getDailyWorkout());
		System.out.println(freeCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
