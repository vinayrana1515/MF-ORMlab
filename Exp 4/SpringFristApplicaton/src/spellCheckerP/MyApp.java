package spellCheckerP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SrpingDI.xml");
			
		TextEditor te=(TextEditor)context.getBean("teditor");
			
		te.spellChecker();
			

	}
}
