package com.ncu.Maven.LoanOrganisationSystem;

// All the information of the customer is saved here using the getter and setter method
import java.util.ArrayList;
import java.util.List;

public class Customer implements IGetInfo{	
	Personal_info info;
	private Loan_info linfo;
	private Address add;
	private String app_no;
	private double income;
	private List<Long> assets;
	private List<Long> liability;
	private ArrayList<Customer> negCustomer;
	private String remarks;

	public void setApp_no(String app_no) {		this.app_no = app_no;	}
	public String getApp_no() {		return app_no;	}
	public Loan_info getLinfo() {		return linfo;	}
	public void setLinfo(Loan_info linfo) {		this.linfo = linfo;	}
	public Personal_info getInfo() {		return info;	}
	public void setInfo(Personal_info info) {		this.info = info;	}
	public String getRemarks() {		return remarks;	}
	public void setRemarks(String remarks) {		this.remarks = remarks;	}
	public Address getAdd() {		return add;	}
	public void setAdd(Address add) {		this.add = add;	}
	public double getIncome() {		return income;	}
	public void setIncome(double income) {		this.income = income;	}
	public List<Long> getAssets() {		return assets;	}
	public void setAssets(List<Long> assets) {		this.assets = assets;	}
	public List<Long> getLiability() {		return liability;	}
	public void setLiability(List<Long> liability) {		this.liability = liability;	}
	public ArrayList<Customer> getNegCustomer() {		return negCustomer;	}
	public void setNegCustomer(ArrayList<Customer> negCustomer) {		this.negCustomer = negCustomer;	}	
	public String generateApp_no() {		String app_no=info.getFull_name().substring(0,3)+info.getPhn().substring(0,5);		return app_no;	}	
}