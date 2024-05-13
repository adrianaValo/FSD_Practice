package com.main;

import java.util.Scanner;

import com.bean.Student;
import com.service.StudentService;

public class DemoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		String result;
		int pid;
		String pname;
		String phone;
		String email;
		int batch;
		String con = "";
		int choice;
		
		do {
			System.out.println("1. Add Student 2. Update Student 3. Delete Student");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter the ID");
				pid = sc.nextInt();
				System.out.println("Enter the name");
				pname = sc.next();
				System.out.println("Enter the phone number");
				phone = sc.next();
				System.out.println("Enter the E-Mail");
				email = sc.next();
				System.out.println("Enter the batch");
				batch = sc.nextInt();
				Student s1 = new Student(pid, pname, phone, email, batch);
				result = ss.storeStudent(s1);
				System.out.println(result);
				break;
				
			case 2: 
				System.out.println("Enter the ID");
				pid = sc.nextInt();
				System.out.println("Enter the new batch");
				batch = sc.nextInt();
				Student s2 = new Student();
				s2.setPid(pid);
				s2.setBatch(batch);
				result = ss.updateStudent(s2);
				System.out.println(result);
				break;
				
			case 3: 
				System.out.println("Enter the ID");
				pid = sc.nextInt();
				result = ss.deleteStudent(pid);
				System.out.println(result);
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			
			System.out.println("Do you want to continue?");
			con = sc.next();
			
		}
		
		while(con.equalsIgnoreCase("Y"));
		System.out.println("Thank you!");
		
		
		
		
		
		 

	}

}
