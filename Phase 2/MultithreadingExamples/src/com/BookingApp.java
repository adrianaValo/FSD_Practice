package com;
class Booking implements Runnable {
	int avl=1;
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}
public class BookingApp {
	public static void main(String[] args) {
		Booking b1 = new Booking();		// avl=1
		//Booking b2 = new Booking();			// avl=1
		//Booking b3 = new Booking();			// avl=1
		Thread client1 = new Thread(b1);
		Thread client2 = new Thread(b1);
		Thread client3 = new Thread(b1);
		client1.setName("Steven");
		client2.setName("Lex");
		client3.setName("John");
		client1.start();
		client2.start();
		client3.start();
	}

}