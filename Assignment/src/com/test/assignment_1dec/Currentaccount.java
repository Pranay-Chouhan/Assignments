package com.test.assignment_1dec;

class Currentaccount extends Account {
	private int noOfTransactionPerMonth = 0;
	double i = 0;

	public void setNoOfTransactionPerMonth(int trn) {
		noOfTransactionPerMonth = trn;
	}

	public int getNoOfTransactionPerMonth() {
		return noOfTransactionPerMonth;
	}

	public double calculateInterest() {

		if (getNoOfTransactionPerMonth() < 9)
			i = (getBalance() * getNoOfYears() * 3 / 100);

		System.out.println(i);
		return i;
	}
}