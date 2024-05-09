package com;

public class StaticUserDefinedMethods {
	
	static void info() {
		System.out.println("Simple user defined method with no passing parameter as well as no return type");
	}
	
	static void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers is " + sum);
	}
	
	static String sayHello(String name) {
		//coding
		return "Welcome user " + name;
	}
	
	public static void main(String[] args) {
		info();
		add(10,20);
		add(100,200);
		add(1,2);
		String result = sayHello("Steven");
		System.out.println(result);
	}

}
