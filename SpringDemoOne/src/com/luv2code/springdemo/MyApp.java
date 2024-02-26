package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create object
		Coach theCoach;
		theCoach = new TrackCoach();
		theCoach = new BaseballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
