package com;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); //it displays the records unordered
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
