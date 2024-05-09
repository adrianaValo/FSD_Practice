package com.service;

import com.bean.Employee;

public class EmployeeService {
	
	Employee emp = new Employee();
	
	public void display() {
		// System.out.println("id is "+emp.id); // private 
		// System.out.println("name is "+ emp.name);  // protected
		// System.out.println("salary is "+ emp.salary);  // default
		System.out.println("designation is "+emp.designation);  // public
	}

}
