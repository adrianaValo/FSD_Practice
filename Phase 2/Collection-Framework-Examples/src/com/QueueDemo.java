package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	// PriorityQueue
		Queue q1 = new PriorityQueue();
	// LinkedList Queue 
		Queue q2 = new LinkedList();
	q1.add(2);q1.add(7);q1.add(6);q1.add(1);q1.add(8); q1.add(2);// unorder , first element with low priority and the rest remains the same
	
	q2.add(2);q2.add(7);q2.add(6);q2.add(1);q2.add(8);  q2.add(2);// order 
		System.out.println(q1);
		System.out.println(q2);
		
		System.out.println(q1.poll());
		System.out.println(q2.poll());
		System.out.println(q1);
		System.out.println(q2);
	}

}