package com.entity;

import com.bean.Employee;

public class Developer extends Employee {
	
	public void displayDevInfo() {
		// System.out.println("id is "+id); // private 
		System.out.println("name is "+name);
		// System.out.println("salary is "+salary);  // default
		System.out.println("designation is "+designation);
	}

}
