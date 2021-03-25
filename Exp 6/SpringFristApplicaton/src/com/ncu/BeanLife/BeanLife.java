package com.ncu.BeanLife;

public class BeanLife implements Coach {
private IFortune ifortune;
	
	public BeanLife() {
		System.out.println("in constructor");
	}
	
	@Override	
	public String getDailyWorkout() {				return "practice 30 hrs daily";	}

	public IFortune getIfortune() {		return ifortune;	}

	public void setIfortune(IFortune ifortune) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.ifortune = ifortune;
	}

	@Override
	public String getDailyFortune() {		return ifortune.getFortune();	}
	public void doMyStartupStuff() {		System.out.println("init method call");	}
	public void doMyCleanupStuff() {
		System.out.println("Destroy method call");
	}

}
