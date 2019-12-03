/* Program to figure out the maximum of given 
 	three numbers.
 */
package com.test.assignment_22nov;

import java.util.Scanner;

// method for computation of highest number
public class Highestnumber {
	public void maxNum(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " is the highest n8umber");
		} else if (b > a && b > c) {
			System.out.println(b + " is the highest number");
		} else {
			System.out.println(c + " is the highest number");
		}
	}

	// main method for the program
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Highestnumber obj = new Highestnumber();
		obj.maxNum(a, b, c);
		sc.close();

	}
}
