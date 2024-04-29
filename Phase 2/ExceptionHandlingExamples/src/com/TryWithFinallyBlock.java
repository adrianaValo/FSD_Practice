package com;

public class TryWithFinallyBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		try {
			int result = 100/0;
			System.out.println("Result " + result);
			System.out.println("No Exception");
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("Normal statement");

	}

}
