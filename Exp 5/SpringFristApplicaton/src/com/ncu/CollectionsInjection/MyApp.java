package com.ncu.CollectionsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context= new ClassPathXmlApplicationContext("CollectionsSpring.xml");
		Customer cust=(Customer)context.getBean("customer");
		System.out.println(cust.toString());

	}

}
