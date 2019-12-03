//	Program to find the reverse of a string
package com.test.assignment_28nov;

import java.util.*;

public class Reversestring {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Reversestring obj = new Reversestring();
		System.out.println("Enter a String to reverse:");
		String str = sc.next();
		obj.revString(str);
		sc.close();
	}

	public void revString(String str) {
		String str1 = "";
		// to calculate the length of string
		for (int i = str.length() - 1; i >= 0; i--) {
			//to find each character from end of the input string and add it in new string
			str1 = str1 + str.charAt(i);

		}
		System.out.println("The reverse of the String is: " + str1);
	}
}