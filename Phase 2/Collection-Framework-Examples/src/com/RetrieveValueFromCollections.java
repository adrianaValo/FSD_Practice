package com;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class RetrieveValueFromCollections {

	public static void main(String[] args) {
		//Set classes
//		Set ss1 = new HashSet();
//		ss1.add(3); ss1.add(5); ss1.add(7); ss1.add(1); ss1.add(9); ss1.add(10); //auto-boxing
//		System.out.println(ss1);
//		// using for each loop
//		System.out.println("Retrieve element one by one using for each loop");
//		for(Object n:ss1) {
//			System.out.println(n);
//		}
//		
//		System.out.println("Retrieve element one by one using iterator"); // we use iterator when we want to also check a condition for example
//		Iterator ii = ss1.iterator(); //it point to set iterator()-> is a method and Iterator is a interface reference
//		while(ii.hasNext()) {
//			Object obj = ii.next();
//			if(obj.equals(1)) {
//				System.out.println("Yes");
//				ii.remove();
//			}
//			System.out.println(obj);
//		}
//		System.out.println(ss1);
//		
		
		//List classes
//		List ll = new ArrayList();
//		ll.add(2); ll.add(1); ll.add(6); ll.add(8);
//		System.out.println("Retrieve elements one by one using for each");
//		for(Object obj : ll) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("Retrieve elements one by one using iterator");
//		Iterator ii = ll.iterator();
//		while(ii.hasNext()) {
//			System.out.println(ii.next());
//		}
//		
//		ListIterator li = ll.listIterator();
//		System.out.println("Retrieve elements one by one using list iterator - forward direction");
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
//		System.out.println("Retrieve elements one by one using list iterator - backward direction");
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
//		
//		Vector vv = new Vector();
//		vv.add(2); vv.add(1); vv.add(6); vv.add(8);
//		System.out.println("Retrieve elements one by one using enumeration from Vector");
//		Enumeration ee = vv.elements();
//		while(ee.hasMoreElements()) {
//			System.out.println(ee.nextElement());
//		}
		
		// Map classes - we can't use for-each loop, iterator, enumeration
		Map mm = new HashMap();
		mm.put(1, " Steven");
		mm.put(2, " Lex");
		mm.put(3, " Maria");
		mm.put(4, " Ana");
		System.out.println(mm);
		
		Set ss = mm.keySet(); // retrieve all keys from map and convert to set
		Iterator ii = ss.iterator();
		while(ii.hasNext()) {
			Object key = ii.next();
			System.out.println("Key " + key + " Value" + mm.get(key));
		}
		
		
		
		
		
		
	}

}
