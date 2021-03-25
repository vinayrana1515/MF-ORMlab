package com.ncu.CollectiveScopeOfClass.CollectiveScopeOfClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	   A a1 = (A)context.getBean("aclass");	
    		A a2 = (A)context.getBean("aclass");
    	
    		((ClassPathXmlApplicationContext)context).close();
    		
    		
    }
}
