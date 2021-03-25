package com.ncu.annotationDemo.IOCAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	System.out.println("inside main");
    	Coach context=(CricketCoach)ac.getBean("ccoach");
    	((ClassPathXmlApplicationContext)ac).close();

    	
    }
}
