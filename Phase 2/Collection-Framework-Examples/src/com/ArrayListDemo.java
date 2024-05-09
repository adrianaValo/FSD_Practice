package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Size "+al.size());
		al.add(3);	// it add at end 
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(2);
		al.add(6);
		System.out.println(al);
		System.out.println("Get value using index position "+al.get(1));
			al.add(1, 50);		// 1st parameter index position, 2nd parameter value 
		System.out.println(al);
		al.set(3, 200);		// 3 index position value replace by 200
		System.out.println(al);
		al.remove(2);		// it remove using index position 
		System.out.println(al);
		Integer abc = 200;	// auto-boxing 
		al.remove(abc);  // remove using value
		System.out.println("Search "+al.contains(6));
		System.out.println("Search "+al.contains(60));
		System.out.println("First elements "+al.get(0));
		System.out.println("last elements "+al.get(al.size()-1));
	}

}