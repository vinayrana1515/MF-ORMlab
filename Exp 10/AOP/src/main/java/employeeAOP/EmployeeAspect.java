package employeeAOP;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	
	@Before("execution(public String employeeAOP.Employee.getName())")
	public void gettingName()
	{
		System.out.println("Before getname method");
	}	
	@After("execution(public void employeeAOP.Employee.setName(String))")
	public void settingName()
	{
		System.out.println("After setname method");
	}	
	@Around("execution(public Float employeeAOP.Employee.cal_sal())")
	public void calculating_sal()
	{
		System.out.println("Around cal_sal method");	}
	}

