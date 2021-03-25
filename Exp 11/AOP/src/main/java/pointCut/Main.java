package pointCut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
	       X x = context.getBean("logic",X.class);
	       x.logicX();
	       
	       context.close();

	}

}
