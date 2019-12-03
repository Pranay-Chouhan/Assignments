/* 	Program should print n number of Fibonacci series
 * to generate fibonacci series as per below inputs
 *  first 4 inputs: 0,1,1,2 and next number is going to be sum of last 4 numbers i.e. (0+1+1+2)=4.  
 */
package com.test.assignment_26nov;

import java.util.Scanner;

public class Fibonacciseries {
	private static int term = 0, first = 0, sec = 1, third = 1, fourth = 2;

	// method for printing the fibonacci series
	public static void printFibonancciSeries(int n) {
		if (n < 4) {
			System.out.println("Invalid Input");
		} else {
			System.out.print("0,1,1,2");
			for (int i = 0; i < n - 4; i++) {
				// logic to calculate the new number
				term = first + sec + third + fourth;
				System.out.print("," + term);
				first = sec;
				sec = third;
				third = fourth;
				fourth = term;
			}
		}
	}

	// main method for the program
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n = sc.nextInt();
		printFibonancciSeries(n);
		sc.close();
	}

}
