package com.ncu.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String Args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("srpingDI.xml");
//	Coach coach=(Coach)context.getBean("myTCoach");
	Coach coach1=(Coach)context.getBean("myBCoach");

	//System.out.println(coach.getDailyWorkout());
	
	//System.out.println(coach.getDailyFortune());
	System.out.println(coach1.toString());
	//System.out.println(coach1.getDailyWorkout());
	//System.out.println(coach1.getDailyFortune());	
		
}}
