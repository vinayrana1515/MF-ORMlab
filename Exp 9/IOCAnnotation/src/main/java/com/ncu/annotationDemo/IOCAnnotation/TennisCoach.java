package com.ncu.annotationDemo.IOCAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tcoach")
public class TennisCoach implements Coach {
	
	private IFortune ifortune;
	public TennisCoach() {	
	}	
	public IFortune getIfo() {
		return ifortune;
	}	
	@Autowired
	public void setIfor(IFortune ifortune) {

		this.ifortune=ifortune;
	}	
	public String getDailyWorkout() {
		return "do strecthing today";
	}		
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}
}