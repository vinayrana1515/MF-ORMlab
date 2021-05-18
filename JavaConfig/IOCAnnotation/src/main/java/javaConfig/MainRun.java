package javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext  ac=new AnnotationConfigApplicationContext(ConfigApp.class);
     
     Coach c=(Coach)ac.getBean("cricketCoach");
    System.out.println(c.getDailyWorkout());
    
    ( (AnnotationConfigApplicationContext)ac).close();
	}

}
