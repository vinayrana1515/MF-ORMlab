package javaConfig;

import org.springframework.beans.factory.annotation.Autowired;

import com.ncu.annotationDemo.IOCAnnotation.IFortune;

public class CricketCoach implements Coach{
private BasketballCoach basket;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Inside daily wotkoutCircket";
	}
	@Autowired
	public CricketCoach(BasketballCoach basket) {
		this.basket=basket;
	}
public void initMethod() {
	System.out.println("inside init");
	
}

public void destroyMethod()
{
	System.out.println("inside destroy");}

}
