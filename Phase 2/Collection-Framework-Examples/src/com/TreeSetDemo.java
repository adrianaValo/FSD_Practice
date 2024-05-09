package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(3);
		ts.add(6);
		ts.add(4);
		ts.add(5);
		ts.add(1);
		//ts.add("Ravi");
		ts.add(9);
		System.out.println(ts);
		System.out.println("Subet " + ts.subSet(3, 7));
		System.out.println("Headset " + ts.headSet(4));
		System.out.println("Tailset " + ts.tailSet(5));
	}

}
