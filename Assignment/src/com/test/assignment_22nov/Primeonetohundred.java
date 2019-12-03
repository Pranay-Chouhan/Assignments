// Program to print the prime numbers between 1 to 100
package com.test.assignment_22nov;

public class Primeonetohundred {

	// method for calculating the prime number
	public void printPrimes() {
		System.out.println("Prime numbers between 1 to 100 are:");
		for (int i = 2; i < 100; i++) {
			int flag = 0;
			// logic to check the number is prime or not
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// main method for the program
	public static void main(String[] args) {
		Primeonetohundred obj = new Primeonetohundred();
		obj.printPrimes();
	}
}
