package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimitiveDataOperations {

	public static void main(String[] args) throws Exception {
//		int id = 100;
//		String name = "Steven";
//		float salary = 25000;
//		boolean result = true;
//		
//		// storing primitve data in file
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		dos.writeBoolean(result);
//		System.out.println("Employee details stored in file");
//		dos.close();
//		fos.close();
		
		// Read primitve data from file
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int eid = dis.readInt();
		String ename = dis.readUTF();
		float esalary = dis.readFloat();
		boolean eresult =dis.readBoolean();
		
		System.out.println("ID is " + eid);
		System.out.println("Name is " + ename);
		System.out.println("Salary is " + esalary);
		System.out.println("Result is " + eresult);
	}

}
