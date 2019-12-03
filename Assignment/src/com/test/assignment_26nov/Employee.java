// Program to execute default and parameterized constructor 
package com.test.assignment_26nov;

public class Employee {
	private String name;
	private int age;
	private String dob;
	private String city;
	private long salary;

	// Default Constructor
	public Employee() {

	}

	// Parameterized constructor
	public Employee(String name, int age, String dob, String city, long salary) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.salary = salary;
	}
	// setter methods for initializing values to the attributes

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void Display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(dob);
		System.out.println(city);
		System.out.println(salary);
	}

	// main method for the program
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Employee emp5 = new Employee();
		emp1.setName("Bikram");
		emp1.setAge(22);
		emp1.setDob("16-05-1997");
		emp1.setCity("Cuttack");
		emp1.setSalary(25000);
		emp1.Display();

		emp2.setName("Aman");
		emp2.setAge(21);
		emp2.setDob("23-11-1998");
		emp2.setCity("Patna");
		emp2.setSalary(28000);
		emp2.Display();

		emp3.setName("Sourav");
		emp3.setAge(20);
		emp3.setDob("17-03-1999");
		emp3.setCity("Delhi");
		emp3.setSalary(23500);
		emp3.Display();

		emp4.setName("Sujeet");
		emp4.setAge(22);
		emp4.setDob("20-06-1997");
		emp4.setCity("Bhubaneswar");
		emp4.setSalary(21000);
		emp4.Display();

		emp5.setName("Ashmita");
		emp5.setAge(23);
		emp5.setDob("31-12-1996");
		emp5.setCity("Rourkela");
		emp5.setSalary(35000);
		emp5.Display();

		Employee emp6 = new Employee("Vibhu", 23, "23-12-1996", "Noida", 21700);
		emp6.Display();
		Employee emp7 = new Employee("Sagar", 24, "23-12-1995", "Bhopal", 26000);
		emp7.Display();
		Employee emp8 = new Employee("Deepak", 25, "23-12-1994", "Chennai", 25900);
		emp8.Display();
		Employee emp9 = new Employee("Saheb", 26, "23-12-1993", "Bangalore", 35000);
		emp9.Display();
		Employee emp10 = new Employee("Utkal", 27, "23-12-1992", "Kolkata", 30000);
		emp10.Display();
	}
}
