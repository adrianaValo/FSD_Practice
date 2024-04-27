package com;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a; //local variable
		int num1[]; //declaration local variable no default value
		int num2[] = { 0, 20, 30, 40, 50, 60, 70, 12, 14, 79, 56}; //declaration with initialization
//		System.out.println(a);
//		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		int n = num2.length;
		System.out.println("Size of the array " + n);
		
		System.out.println("retrieve value from array using loop one by one");
		for (int i = 0; i < n; i++) {
			System.out.println(num2[i]);
		}
		int num3[] = new int[10]; //memory created
		
		System.out.println("Size of array is" + num3.length);
		System.out.println("Value of 0 position is " + num3[0]);
		System.out.println("Value of 9 position is " + num3[9]);
		//System.out.println("Value of 9 position is " + num3[10]);
		num3[0] = 100;
		num3[1] = 101;
		System.out.println("Value of 0 position is " + num3[0]);
		System.out.println("Value of 1 position is " + num3[1]);
		
		

	}

}
