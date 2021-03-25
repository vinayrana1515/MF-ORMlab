package aopDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAspect {
	
	@Before("execution(public void addAccount())")
	public void logToCloudAdvice()
	{
		System.out.println("Log into the cloud");
	}

}
