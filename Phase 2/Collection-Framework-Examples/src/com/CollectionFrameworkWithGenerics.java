package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFrameworkWithGenerics {

	public static void main(String[] args) {
//		// collection framework without generics 
		List ll = new ArrayList();
		ll.add(10);	// auto-boxing : converting primitive to object. 
//		ll.add(10.10);
//		ll.add("Steven");
//		ll.add(true);
//		
//		Object obj = ll.get(1);		// obj object type consider 
//		Integer i = (Integer)obj;	// i Integer object consider explicit type casting on class level 
//		int n = i.intValue();		// n int primitive consider : converting integer object to int primitive 
//		System.out.println(n);
		
		// collection framework with generics 
		List<Integer> ll1 = new ArrayList<Integer>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		//ll1.add(10.10);
		//ll1.add("Ravi");
		
		int n = ll1.get(1);	// auto-unboxing : converting object to primitive 
		System.out.println(n);
		
		Map<Integer, String> mm = new HashMap<Integer, String>();
		mm.put(1, "Ravi");
		mm.put(2, "Steven");
		Set<Integer> ss = mm.keySet();
		Iterator<Integer> li = ss.iterator();
		while(li.hasNext()) {
			int key = li.next();
			System.out.println("key "+key+" value "+mm.get(key));
		}
	}

}