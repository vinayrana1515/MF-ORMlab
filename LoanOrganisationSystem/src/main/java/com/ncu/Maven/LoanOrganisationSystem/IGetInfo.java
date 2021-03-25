package com.ncu.Maven.LoanOrganisationSystem;

import java.util.ArrayList;
import java.util.List;
// Interface which consist of method which are implemented in customer class
public interface IGetInfo {
	
	public Address getAdd();
	public double getIncome();
	public void setIncome(double income);
	public Personal_info getInfo();
	public List<Long> getAssets();
	public void setAssets(List<Long> assets);
	public List<Long> getLiability();
	public void setLiability(List<Long> liability);
	public ArrayList<Customer> getNegCustomer();
	public String getRemarks();
	public void setRemarks(String remarks);
	public Loan_info getLinfo();
	public String generateApp_no();
	public void setApp_no(String app_no);
	public String getApp_no();
}
