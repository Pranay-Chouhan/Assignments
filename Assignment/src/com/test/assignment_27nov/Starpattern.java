package com.test.assignment_27nov;

/* Program to print the following pattern
 			
 			  *
 		     * *
 		    * * *
 		   * * * *
 		  * * * * *
 		   * * * *
 		    * * *
 		     * *
 		      *     */
public class Starpattern {
	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) {

			// loop to print the number of spaces
			for (int j = row; j >= i; j--) {
				System.out.print(" ");
			}

			// loop to print the Star
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// for new line
			System.out.println();
		}
		for (int i = row - 1; i >= 1; i--) {

			// loop to print the number of spaces
			for (int j = row - 1; j >= i - 1; j--) {
				System.out.print(" ");
			}

			// loop to print the Star
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// for new line
			System.out.println();
		}
	}
}