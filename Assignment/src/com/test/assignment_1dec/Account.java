package com.test.assignment_1dec;

public class Account {
	private String accountNo;
	private String accountName;
	private String accountType;
	private int noOfYears;
	private double balance;

	public void setAccountNo(String acc) {
		accountNo = acc;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountName(String name) {
		accountName = name;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountType(String type) {
		accountType = type;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setNoOfYears(int yr) {
		noOfYears = yr;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setBalance(double bal) {
		balance = bal;
	}

	public double getBalance() {
		return balance;
	}

}