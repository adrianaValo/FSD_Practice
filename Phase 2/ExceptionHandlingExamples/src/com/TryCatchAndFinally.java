package com;

public class TryCatchAndFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		try {
			int result = 100/0;
			System.out.println("Result " + result);
			System.out.println("No exception");
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("Normal statement");

	}

}
