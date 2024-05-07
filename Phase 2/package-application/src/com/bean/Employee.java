package com.bean;

public class Employee {

	private int id;
	protected String name;
	float salary;
	public String designation;
	
	public void displayEmpInfo() {
		System.out.println(" ID is " + id);
		System.out.println(" Name is " + name);
		System.out.println(" Salary is " + salary);
		System.out.println(" designation is " + designation);
	}
}
