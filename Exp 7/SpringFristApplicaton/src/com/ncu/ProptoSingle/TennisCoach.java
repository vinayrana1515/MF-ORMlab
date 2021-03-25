package com.ncu.ProptoSingle;

public class TennisCoach implements Coach {
private String name;
	
	//public TennisCoach(String name)
	//{
	//	this.name=name;
	//}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDailyWorkout() 
	{
		return "Practice 2 hrs daily";
	}
}
