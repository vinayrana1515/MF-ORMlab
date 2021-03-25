package aopDemo;

//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DemoLoggingAspect {
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() 
	{
		
		System.out.println("Adding account");		
	}	
}
