package com.ncu.BeanLife;

public class Fortune implements IFortune {
	public String getFortune() {
		return "you have a good fortune today";
	}
public Fortune() {
	System.out.println("inside fortune constructor");
}
}
