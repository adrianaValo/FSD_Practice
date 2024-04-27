package com;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte a  = 10;
//		short b = a; //implicit typecasting
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//		
//		
//		short c = 10;
//		byte d = (byte)c; //explicit typecasting
//		System.out.println("c: " + c);
//		System.out.println("d: " + d);
		
		int a = 100;
		float b = a; //implicit type casting
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		//float c = 100.10f; // explicit type casting converting double to float
		//float c = (float)100.0; // explicit type casting converting double to float
		
		double c = 100.0;
		int d = (int)c;
		
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
		
		
		

	}

}
