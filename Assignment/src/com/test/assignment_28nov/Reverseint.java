//program to reverse a number
package com.test.assignment_28nov;

import java.util.Scanner;

public class Reverseint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Reverseint obj = new Reverseint();
		System.out.println("Enter a number to reverse:");
		int num = sc.nextInt();
		obj.revNum(num);
		sc.close();
	}

	// logic to reverse the number
	public void revNum(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("The reverse of the number is: " + sum);
	}
}