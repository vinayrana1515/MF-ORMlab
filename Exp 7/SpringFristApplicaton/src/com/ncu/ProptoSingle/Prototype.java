package com.ncu.ProptoSingle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prototype {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("prototype.xml");
		
		
		Coach coach = (Coach)context.getBean("myCoach");	
		Coach coach2 = (Coach)context.getBean("myCoach");
	    coach.setName("Vinay");
		coach2.setName("Unnati");
		
		System.out.println(coach.getName());
		System.out.println(coach2.getName());

	}
}
