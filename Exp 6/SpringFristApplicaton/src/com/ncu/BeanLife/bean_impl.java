package com.ncu.BeanLife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bean_impl {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean_life_cycle.xml");
		
		System.out.println("bean factory called");
		Coach coach=(Coach)context.getBean("beanlife");
	//	Coach coach1=(Coach)context.getBean("beanlife");
		//System.out.println(coach);
	 	//System.out.println(coach1);
		((ClassPathXmlApplicationContext)context).close();

	}

}
