package com.luv2code.springdemo;

public class FootballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "run atleast 2 kilometers daily!";
	}

}
