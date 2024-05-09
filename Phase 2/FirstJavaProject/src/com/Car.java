package com;

public class Car {
	int wheel;
	float price;
	String colour;	// instance varialbe 
	Car() {			// empty constructor 
		wheel=4;
		price=30000;
		colour="Black";
		System.out.println("car class object created..");
	}
	Car(int wheel, float price, 
			String colour) {	//parameterized constructor 
			this.wheel = wheel;
			this.price = price;
			this.colour = colour;
	}
	void start() {
		System.out.println("Car start");
	}
	void appliedGear() {
		System.out.println("Applied Gear");
	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car stop");
	}
//	void setCarInfo(int wheel1, float price1, 
//			String colour1) {
//			wheel = wheel1;
//			price = price1;
//			colour = colour1;
//	}
	void setCarInfo(int wheel, float price, 
			String colour) {
			this.wheel = wheel;
			this.price = price;
			this.colour = colour;
	}
	void displayCarInfo() {
		String msg="Car Info";	// local variable 
		System.out.println("message  "+msg);
		System.out.println("wheel "+wheel);
		System.out.println("colour  "+colour);
		System.out.println("price "+price);
		
	}
}