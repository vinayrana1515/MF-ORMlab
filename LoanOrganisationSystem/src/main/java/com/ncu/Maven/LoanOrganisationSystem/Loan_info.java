package com.ncu.Maven.LoanOrganisationSystem;

public class Loan_info {
	
	private String loanType;
	private double amount;
	private double totalincome;
	private int duration;	
	private double incm_score;
	
	public double getTotalincome() {		return totalincome;	}
	public void setTotalincome(double totalincome) {		this.totalincome = totalincome;	}
	
	public String getLoanType() {		return loanType;	}
	public void setLoanType(String loanType) {		this.loanType = loanType;	}
	public double getAmount() {		return amount;	}
	public void setAmount(double amount) {		this.amount = amount;	}
	public int getDuration() {		return duration;	}
	public void setDuration(int duration) {		this.duration = duration;	}
	public double getIncm_score() {		return incm_score;	}
	public void setIncm_score(double incm_score) {		this.incm_score = incm_score;	}



}
