package com.ncu.Maven.LoanOrganisationSystem;

// Address class to take input of different attributes of address
public class Address {
	
	private String city;
	private int house_no;
	private String state;
	private int pincode;
	
	@Override
	public String toString() {		return "Address: "+city+" "+house_no+" "+state+" "+pincode;	}
	
	public String getCity() {		return city;	}
	
	public void setCity(String city) {		this.city = city;	}
	
	public int getHouse_no() {		return house_no;	}	
	
	public void setHouse_no(int house_no) {		this.house_no = house_no;	}
	
	public String getState() {		return state;	}
	
	public void setState(String state) {		this.state = state;	}
	
	public int getPincode() {		return pincode;	}
	
	public void setPincode(int pincode) {		this.pincode = pincode;	}
			
}