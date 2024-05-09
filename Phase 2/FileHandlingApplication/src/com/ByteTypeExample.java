package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteTypeExample {

	public static void main(String[] args) throws Exception {
		//source: keyboard
		// target: file
		
//		DataInputStream dis = new DataInputStream(System.in);
//		//FileOutputStream fos = new FileOutputStream("abc.txt");//override
//		FileOutputStream fos = new FileOutputStream("abc.txt", true); //append the data
//		
//		int ch;
//		System.out.println("Please enter the data and exit when you enter @");
//		while((ch = dis.read()) != '@') {
//			System.out.println(ch + "=" + (char)ch); //change the ch type
//			fos.write(ch);
//		}
//		
//		fos.close();
//		System.out.println("Data stored in file");
		
		// Source : file
		// target: console or file
		
		FileInputStream fis = new FileInputStream("C:\\Users\\OlteanuA2\\OneDrive - Vodafone Group\\Desktop\\example.txt");
		FileOutputStream fos = new FileOutputStream("demo.txt");
		int ch;
		while((ch = fis.read()) != -1 ) {  // -1 is equal to EOF
			fos.write(ch);
			System.out.println((char)ch);
		}
		System.out.println("file copied");
		fis.close();
		fos.close();
		

	}

}
