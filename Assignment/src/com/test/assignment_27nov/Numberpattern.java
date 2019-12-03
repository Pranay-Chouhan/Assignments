package com.test.assignment_27nov;

/* Program to print the following pattern
			1
		   2 2
		  3 3 3
		 4 4 4 4
		5 5 5 5 5
		 4 4 4 4
		  3 3 3
		   2 2
			1	*/
public class Numberpattern {
	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) {

			// loop to print the number of spaces
			for (int j = row; j >= i; j--) {
				System.out.print(" ");
			}

			// loop to print the number
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			// for new line
			System.out.println();
		}
		for (int i = row - 1; i >= 1; i--) {

			// loop to print the number of spaces
			for (int j = row - 1; j >= i - 1; j--) {
				System.out.print(" ");
			}

			// loop to print the number
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			// for new line
			System.out.println();
		}
	}
}
