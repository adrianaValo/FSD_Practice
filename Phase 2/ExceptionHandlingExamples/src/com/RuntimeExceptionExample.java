package com;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		int a = 10;
		int b = 1;
		int abc[] = {10, 20, 30, 40};
		String xyz = "a10";
		
		try {
			int res = a / b;
			System.out.println("Result is " + res);
			int res1 = abc[0]/100;
			System.out.println("Result is " + res1);
			System.out.println(xyz + 10);
			System.out.println(Integer.parseInt(xyz) + 10); //transform string into integer
		} catch(Exception e) {
			//System.out.println("I'll take care!");
			//System.out.println(e.getMessage()); //short exception message
			System.out.println(e.toString());
		}
		
		
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");

	}

}
