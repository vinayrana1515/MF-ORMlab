package aopDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
	
		AccountDao theAccountDao=context.getBean("accountDao",AccountDao.class);
	
		theAccountDao.addAccount();
				
		context.close();
	}
}
