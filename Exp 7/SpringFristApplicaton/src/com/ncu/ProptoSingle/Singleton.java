package com.ncu.ProptoSingle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Singleton {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("singleton.xml");
		
		
		Coach coach = (Coach)context.getBean("myCoach");	
		Coach coach2 = (Coach)context.getBean("myCoach");	
		coach.setName("Unnati");
		coach2.setName("Vinay");
		
		System.out.println(coach.getName());
		System.out.println(coach2.getName());

	}

}
