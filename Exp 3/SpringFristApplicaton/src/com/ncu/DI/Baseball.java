package com.ncu.DI;

public class Baseball implements Coach {
private IFortune ifortune;
private String name;
private String email;
private String teamname;
private Address add;

public Address getAdd() { return add; }
public void setAdd(Address add) {	this.add = add;}
public String getName() {	return name;}
public void setName(String name) {	this.name = name;}
public String getEmail() {	return email;}
public void setEmail(String email) {	this.email = email;}
public String getTeamname() {	return teamname;}
public void setTeamname(String teamname) {	this.teamname = teamname;}

public Baseball(IFortune ifortune) {		this.ifortune = ifortune;    }
public Baseball(String name, String email,String teamname) {	this.name=name;	this.email=email;	this.teamname=teamname;}
	public IFortune getIfortune() {		return ifortune;	}
	public void setIfortune(IFortune ifortune) {		System.out.println("inside setter");		this.ifortune = ifortune;	}
	  public String toString()	    {	        return name+" "+email+" "+teamname+" "+add.getCity()+" "+add.getDistrict()+" "+add.getState()+" "+add;	    }
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 30 hrs daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}
}
