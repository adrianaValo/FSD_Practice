package com.main;

import java.util.Scanner;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		
//		Employee emp1 = new Employee();
//		emp1.setId(100);
//		emp1.setName("Ravi");
//		emp1.setSalary(14000);
//		
//		Employee emp2 = new Employee(101, "Steven", 24000);
//		
//		System.out.println("id is "+ emp1.getId());
//		System.out.println("name is "+ emp1.getName());
//		System.out.println("salary is "+ emp1.getSalary());
//		
//		System.out.println("id is "+ emp2.getId());
//		System.out.println("name is "+ emp2.getName());
//		System.out.println("salary is "+ emp2.getSalary());
//		
//		System.out.println(emp1);
		
		// Another method with Scanner:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees do you want to store?");
		int size = sc.nextInt();
		Employee employees[] = new Employee[size]; //array object created
		
		System.out.println("Please enter employee records one by one");
		for(int i = 0; i< size; i++) {
			System.out.println("Enter the " + (i + 1) + " th employee details");
			employees[i] = new Employee(); //memory created using index position
			System.out.println("Enter the ID");
			int id = sc.nextInt();
			employees[i].setId(id);
			System.out.println("Enter the name");
			String name = sc.next();
			employees[i].setName(name);
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			employees[i].setSalary(salary);
		}
		
		// business logic
		System.out.println("All the employee details are: ");
		for(Employee emp:employees) {
			System.out.println(emp); // it calls toString method
			//System.out.println("ID is " + emp.getId() + " Name is " + emp.getName());
		}

	}

}
