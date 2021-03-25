package pointCut;

import org.springframework.stereotype.Component;

@Component("logic")
public class X {
	
	public void logicX() 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println("X Logic I is "+i);
		}
	}
	

	
	
}
