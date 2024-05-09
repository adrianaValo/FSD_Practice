package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

<<<<<<< HEAD
	public static void main(String[] args) throws Exception{
//	Employee emp1 = new Employee(100, "Steven", 45000);
//	System.out.println(emp1);
//	// store object in file 
//	FileOutputStream fos = new FileOutputStream("employee.txt");
//	ObjectOutputStream oos = new ObjectOutputStream(fos);
//	oos.writeObject(emp1);
//	System.out.println("object serialization done successfully");
		
	FileInputStream fis = new FileInputStream("employee.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj = ois.readObject();	// return type is object class reference. 
	Employee emp2 = (Employee)obj;
	System.out.println(emp2);
	}

}
=======
	public static void main(String[] args) throws Exception {
//		Employee emp1 = new Employee(100, "Steven", 45000);
//	System.out.println(emp1);
////		// Store object in file
//	FileOutputStream fos = new FileOutputStream("employee.txt");
//		ObjectOutputStream oos  = new ObjectOutputStream(fos);
//	oos.writeObject(emp1);
//		System.out.println("Object serialization done successfully");
		
	FileInputStream fis = new FileInputStream("employee.txt");	
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj = ois.readObject(); //return type is object class reference
	Employee emp2 = (Employee)obj;
	System.out.println(emp2);

	}

}
>>>>>>> 9cfdf5663bc3783892fc324715d383b9484e1be6
