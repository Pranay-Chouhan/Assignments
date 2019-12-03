/*      Program for calculation of electricity bill
 		based on the specific conditions provided for 
 		units of electricity and accordingly doing the 
 		mathematical computation for the same
 */
package com.test.assignment_22nov;

import java.util.Scanner;

public class Electricitybill {
	private int unit;
	private int cost = 0;

	// inbuilt setter method for setting the electricity units
	public void setUnit(int unit) {
		this.unit = unit;
	}

	// mathematical computation of bill cost based on specied condition
	public int calculateCost() {
		if (unit > 0 && unit <= 100) {
			cost = unit * 5;
		} else if (unit > 100 && unit < 301) {
			cost = 500 + ((unit - 100) * 10);
		} else if (unit > 300) {
			cost = 2500 + ((unit - 300) * 20);
		}
		return cost;
	}

	// main method for the class
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units");
		int unit = sc.nextInt();
		Electricitybill obj = new Electricitybill();
		obj.setUnit(unit);

		System.out.println("Computed Bill is: " + obj.calculateCost());
		sc.close();
	}

}
