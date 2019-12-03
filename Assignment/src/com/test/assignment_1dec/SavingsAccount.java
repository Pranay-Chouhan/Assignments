package com.test.assignment_1dec;

class Savingsaccount extends Account {
	private double minBalance = 5000;

	public void setMinBalance(double min) {
		minBalance = min;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public double calculateInterest() {
		double i = 0;
		double in = 0;
		if (getBalance() > minBalance) {
			if (getBalance() > 200000)
				in = 4;
			else
				in = 3.5;
			i = getBalance() * getNoOfYears() * in / 100;
		}

		return i;
	}

}