package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// HashMap Example
//		HashMap hm = new HashMap(); //unordered
//		hm.put(2,  "Steven");
//		hm.put(3,  "John");
//		hm.put(4,  "Lex");
//		hm.put(6,  "Neena");
//		hm.put("A",  "B");
//		System.out.println(hm);
//		
//		hm.put(2, "Akash");
//		System.out.println(hm);
//		System.out.println("get value " + hm.get(2));
//		System.out.println("present key " + hm.containsKey(1));
//		System.out.println("present value " + hm.containsValue("Neena"));
		
		// LinkedHashmap example
//		LinkedHashMap hm = new LinkedHashMap(); //ordered
//		hm.put(2,  "Steven");
//		hm.put(3,  "John");
//		hm.put(4,  "Lex");
//		hm.put(6,  "Neena");
//		hm.put("A",  "B");
//		System.out.println(hm);
//		
//		hm.put(2, "Akash");
//		System.out.println(hm);
//		System.out.println("get value " + hm.get(2));
//		System.out.println("present key " + hm.containsKey(1));
//		System.out.println("present value " + hm.containsValue("Neena"));
		
		//TreeHashMap
		
//		TreeMap hm = new TreeMap(); //ordered
//		hm.put(2,  "Steven");
//		hm.put(3,  "John");
//		hm.put(4,  "Lex");
//		hm.put(6,  "Neena");
//		// hm.put("A",  "B");
//		System.out.println(hm);
//		
//		hm.put(2, "Akash");
//		System.out.println(hm);
//		System.out.println("get value " + hm.get(2));
//		System.out.println("present key " + hm.containsKey(1));
//		System.out.println("present value " + hm.containsValue("Neena"));
		
		
		// Hashtable Example
		
		Hashtable hm = new Hashtable(); //legacy class and by default all methods are synchronized
		hm.put(2,  "Steven");
		hm.put(3,  "John");
		hm.put(4,  "Lex");
		hm.put(6,  "Neena");
		hm.put("A",  "B");
		System.out.println(hm);
		hm.put(10,  "Steven");
		hm.put(2, "Akash");
		System.out.println(hm);
		System.out.println("get value " + hm.get(2));
		System.out.println("present key " + hm.containsKey(1));
		System.out.println("present value " + hm.containsValue("Neena"));
	}

}
