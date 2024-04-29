package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		
		try {
			int result1 = 100/1;
			System.out.println("result " + result1);
			int result2 = Integer.parseInt("10a") + 10;
			System.out.println("result " + result2);
			
		} catch (ArithmeticException e){
			System.out.println("Arithmetic " + e.toString());
					
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Array index " + e.toString());
			
		} catch (Exception e) {
			System.out.println("Generic " + e.toString());
		}
		System.out.println("Done!");

	}

}
