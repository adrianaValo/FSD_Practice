package com;

public class EmployeeTest {

	public static void main(String[] args) {
		//display();
		// id = 100;
		
		Employee emp1 = new Employee();
		//emp1.id = 100;
		//emp1.name = "Steven";
		//emp1.salary = -45000;
		
		emp1.setEmployeeInfo(100, "Steven", -45000);
		emp1.display();

	}

}
