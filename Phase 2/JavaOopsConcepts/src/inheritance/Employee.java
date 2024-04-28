package inheritance;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private float salary;
	Scanner sc = new Scanner(System.in);
	Address add = new Address(); 
	
	void readEmp() {
		System.out.println("Enter the ID");
		id = sc.nextInt();
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the salary");
		salary = sc.nextFloat();
	}
	
	void disEmp() {
		System.out.println("ID is " + id);
		System.out.println("Name is " + name);
		System.out.println("Salary is " + salary);
		
	}
}
