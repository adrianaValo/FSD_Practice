package com;

class Task implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
		
	}
	
}

public class TaskDemo {

	public static void main(String[] args) {
		Task tt = new Task();
		Thread client1 = new Thread();
		Thread client2 = new Thread();
		Thread client3 = new Thread();
		
		client1.setName("client1");
		client2.setName("client2");
		client3.setName("client3");
		
		client1.start();
		client2.start();
		client3.start();
		
		Thread t = Thread.currentThread();
		System.out.println(t);

	}

}
