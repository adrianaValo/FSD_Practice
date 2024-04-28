package com;

public class CarTest {

	public static void main(String[] args) {
		//Create the object class of that class in order to call it
		Car innova = new Car();
		Car bmw = new Car();
		Car santro = new Car(4, 80000, "Red"); // parametrized constructor
		
//		innova.start();
//		innova.stop();
		//innova.displayCarInfo();
//		innova.wheel = 4;
//		innova.price  = 2345566;
//		innova.colour = "Gray";
		
	innova.setCarInfo(4, 2345566, "Gray");
	innova.setCarInfo(8, 2345566, "Blue");
	innova.setCarInfo(12, 234545, "Yellow");
		
//		bmw.displayCarInfo();
//		bmw.wheel = 3;
//		bmw.price  = 87686;
//		bmw.colour = "Blue";
		
//		bmw.setCarInfo(3, 87686, "Blue");
		
		
		
		innova.displayCarInfo();
		bmw.displayCarInfo();
		santro.displayCarInfo();

	}

}
