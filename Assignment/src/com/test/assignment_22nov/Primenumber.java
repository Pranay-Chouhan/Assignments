//	 Program to check whether a given number is prime or not.
package com.test.assignment_22nov;

import java.util.Scanner;

public class Primenumber {

	private int flag = 0;

	public void checkPrime(int n) {

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("it is not a prime number");
		}
	}
	// main method for the program

	public static void main(String args[]) {
		Primenumber obj = new Primenumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		obj.checkPrime(n);
		sc.close();
	}
}
