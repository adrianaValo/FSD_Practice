package com;

import java.util.HashSet;
class Customer {
	
}

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("size " + hs.size());
		System.out.println("Empty " + hs.isEmpty());
		//hs.add(10); //primitive value
		int a = 10;
		Integer b = new Integer(a); //converting primitive to object
		hs.add(b);
		hs.add(20); //auto-boxing: converting primitive to object automatically
		hs.add(10.10);
		hs.add(true);
		hs.add("Ravi");
		
		Customer cc = new Customer();
		hs.add(cc);
		System.out.println("size " + hs.size());
		System.out.println("Empty " + hs.isEmpty());
		

	}

}
