package com;
import java.util.Scanner;

public class TakingValueThroughKeyboards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of a");
//		int a = sc.nextInt();
//		System.out.println("Enter the value of b");
//		int b = sc.nextInt();
//		int sum = a+ b;
//		System.out.println("Sum of two numbers is " + sum);
		
//		String name = "Steven";
//		System.out.println("Name is " + name);
//		System.out.println("Enter the employee details");
//		System.out.println("Enter the ID");
//		int id = sc.nextInt(); //scan int value
//		System.out.println("Enter the name");
//		String fname = sc.next();
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//		System.out.println("ID is " + id);
//		System.out.println("Name is " + fname);
//		System.out.println("Salary is " + salary);
	
		System.out.println("How many numbers do you want to store? ");
		int n = sc.nextInt();
		int num[] = new int[n]; //the array
		System.out.println("Enter the numbers one by one");
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			
		}
		
		int sum = 0, esum = 0, osum = 0;
		for (int a: num) {
			if(a % 2 == 0) {
				esum = esum + a;
			} else {
				osum = osum + a;
			}
			sum = sum + a;
		}
		
		System.out.println("The numbers are");
		for(int n1:num) {
			System.out.println(n1);
			
		}
		
		System.out.println("Sum of all the numbers is " + sum);
		System.out.println("Sum of the even numbers is " + esum);
		System.out.println("Sum of the odd numbers is " + osum);
		
		

	}

}
