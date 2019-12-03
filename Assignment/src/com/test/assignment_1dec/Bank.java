package com.test.assignment_1dec;

/* Create a program Bank to calculate Interest of saving or current account
Assume the minBalance  is always 5000
for savings account,if the balance is above the minimum balance then calculate the simple interest for the given interest rate. Else no interest is paid.
balance *noOfYears* intRate/100
If the balance is greater than 200000, then interestRate(intRate) will be fixed as 4% other wise 3.5% 
for current account, If the noOfTransactionPerMonth is less than the allowed number then calculate the simple interest for the given interest rate (ASSUME THE allowed number of transaction as 8). Else, no interest is paid.
balance * noOfYears*intRate/100
Here interestRate (intRate) is always fixed as 3% irrespective of the balance	*/
import java.util.Scanner;

public class Bank {

	public void determineAccountType(String accountType) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		String acc = sc.next();
		System.out.println("Enter the Account Name");
		String name = sc.next();
		System.out.println("Enter the No of years:");
		int yr = sc.nextInt();
		System.out.println("Enter the balance:");
		double bal = sc.nextDouble();
		Savingsaccount ob1 = new Savingsaccount();
		Currentaccount ob2 = new Currentaccount();

		if (accountType.equals("saving")) {

			ob1.setAccountNo(acc);
			ob1.setAccountName(name);
			ob1.setNoOfYears(yr);
			ob1.setBalance(bal);
			System.out.println("The Interest of " + ob1.getAccountName() + " of Account Type " + accountType + " is "
					+ ob1.calculateInterest());
			System.exit(0);
		}

		else if (accountType.equals("current")) {

			ob2.setAccountNo(acc);
			ob2.setAccountName(name);
			ob2.setNoOfYears(yr);
			ob2.setBalance(bal);
			System.out.println("Enter the number of Transaction:");
			int nt = sc.nextInt();
			ob2.setNoOfTransactionPerMonth(nt);

			System.out.println("The Interest for " + ob2.getAccountName() + " of Account Type " + accountType + " is "
					+ ob2.calculateInterest());
		}
		sc.close();

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bank obj = new Bank();
		System.out.println("Enter the Account Type(saving/current)");
		String type = s.next();
		obj.determineAccountType(type);
		s.close();
	}
}