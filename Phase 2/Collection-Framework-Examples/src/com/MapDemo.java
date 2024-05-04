package com;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// HashMap Example
		HashMap hm = new HashMap(); //unordered
		hm.put(2,  "Steven");
		hm.put(3,  "John");
		hm.put(4,  "Lex");
		hm.put(6,  "Neena");
		hm.put("A",  "B");
		System.out.println(hm);
		
		hm.put(2, "Akash");
		System.out.println(hm);
		System.out.println("get value " + hm.get(2));
		System.out.println("present key " + hm.containsKey(1));
		System.out.println("present value " + hm.containsValue("Neena"));
	}

}
