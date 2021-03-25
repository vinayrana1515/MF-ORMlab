package com.ncu.Maven.LoanOrganisationSystem;

import java.util.List;
// To get personal information of the user
public class Personal_info {
	

	private String full_name;
	private int age;
	private String phn;
	private String email;
	private String aadharCard;
	private String panCard;
	
	public String getFull_name() {		return full_name;	}
	public void setFull_name(String full_name) {		this.full_name = full_name;	}
	public int getAge() {		return age;	}
	public void setAge(int age) {		this.age = age;	}
	public String getPhn() {		return phn;	}
	public void setPhn(String phn) {		this.phn = phn;	}
	public String getEmail() {		return email;	}
	public void setEmail(String email) {		this.email = email;	}
	public String getAadharCard() {		return aadharCard;	}
	public void setAadharCard(String aadharCard) {		this.aadharCard = aadharCard;	}
	public String getPanCard() {		return panCard;	}
	public void setPanCard(String panCard) {		this.panCard = panCard;	}
}
