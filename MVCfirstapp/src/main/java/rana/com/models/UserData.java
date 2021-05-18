package rana.com.models;
import javax.validation.constraints.*;

import rana.com.customValid.CustValid;

public class UserData {
	
@NotNull(message="cannot be empty")
private String name;

@NotNull
@CustValid(message="must have 8 min Char, starts With a Capital letter contains special characters")
private String pwd;

@NotNull(message="cannot be empty")
@Min(18)
private int age;

@NotNull(message="cannot be empty")
@Pattern(regexp="^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+$",message="Enter valid email")
private String email;

@NotNull(message="cannot be empty")
@Pattern(regexp="[0-9]{10}", message="Only 10 digits allowed")
private String phone;




public UserData() {
	
}


public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}



}
