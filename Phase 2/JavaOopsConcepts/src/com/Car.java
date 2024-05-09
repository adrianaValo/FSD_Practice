package com;

public class Car {
	int wheel;
	float price;
	String colour; // instance variable
	
	Car() { //Constructor, returns nothing, it is called automatically
		//used for default intialization
		wheel = 4;
		price = 30000;
		colour = "Black";
		// empty constructor
		System.out.println("Car class object created..");
	}
	
	Car(int wheel, float price, String colour) { // parametrized constructor
		this.wheel = wheel;
		this.price = price;
		this.colour = colour;
	}
	void start() {
		System.out.println("Car start");
	}
	
	void aplliedGear() {
		System.out.println("Applied Gear");
		
	}
	
	void moving() {
		System.out.println("Car is moving");
		
	}

	void stop() {
		System.out.println("Car stop");
	
	}
	
//	void setCarInfo(int wheel1, float price1, String colour1) {
//		wheel = wheel1;
//		price = price1;
//		colour = colour1;
//		
//		
//	}
	
	void setCarInfo(int wheel, float price, String colour) {
		this.wheel = wheel;
		this.price = price;
		this.colour = colour;
	}
	
	void displayCarInfo() {
		String msg = "Car Info"; // local variable
		System.out.println("message " + msg);
		System.out.println("Wheel " + wheel);
		System.out.println("Colour " + colour);
		System.out.println("Price " + price);
		
	}
	
	

}
