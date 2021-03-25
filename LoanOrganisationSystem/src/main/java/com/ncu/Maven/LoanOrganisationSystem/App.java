package com.ncu.Maven.LoanOrganisationSystem;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Main class to execute the program
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        LoanProcess a = (LoanProcess)context.getBean("lprocess");
        IGetInfo iginfo =(Customer)context.getBean("customer");
        a.Sourcing(iginfo);
        	
    }
}
