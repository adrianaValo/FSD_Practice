package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet(); //it mantains the order
		hs.add(3);
		hs.add(1);
		hs.add(6);
		hs.add(8);
		hs.add("Ravi");
		
		hs.add(2);
		hs.add(3);
		System.out.println(hs); //it displays the result as string format
		System.out.println("Search " + hs.contains(3));
		System.out.println("Search " + hs.contains(30));
		hs.remove(1);
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		System.out.println("Size is " + hs.size());

	}

}
