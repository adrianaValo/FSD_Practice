package com;

public class ThrowsExample {
	static void dis1() throws Exception {
		//try {
		int result = 100 / 0;
		System.out.println("Result " + result);
		//} catch (Exception e) {}
		System.out.println("dis1 method");
	}

	public static void main(String[] args) throws Exception {
		try {
			dis1();
		} catch (Exception e) {}
		System.out.println("Main method");

	}

}
