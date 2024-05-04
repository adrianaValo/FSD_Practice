package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		
		// 100 gets added
		
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println(ll);
		ll.add(2,100);
		ll.remove(4);
		System.out.println("get first elements " + ll.getFirst());
		System.out.println("get last elements " + ll.getLast());

	}

}
