package employeeAOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
	
		Employee employ=context.getBean("employee",Employee.class);
	
		employ.setName("Vinay");
		System.out.println("Employee's name "+employ.getName());
		employ.setNo_of_day_working(25);
	 	Float sal=employ.cal_sal();
		System.out.println("Employee's salary "+ sal);
	
		
				
		context.close();
	}

}
