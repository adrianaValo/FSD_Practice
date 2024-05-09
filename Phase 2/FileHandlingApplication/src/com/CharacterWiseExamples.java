package com;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterWiseExamples {

	public static void main(String[] args) throws Exception {
		// Source : keyboard
		// target : file
//		InputStreamReader isr = new InputStreamReader(System.in);
//		FileWriter fw = new FileWriter("xyz.txt");
//		System.out.println("Enter the data");
//		int ch;
//		while ((ch = isr.read()) != '@') {
//			fw.write(ch);
//		}
//		fw.flush(); // this method is used to send the data from buffer to file
//		System.out.println("Data stored");
		
		// Source: keyboard
		// Target: file
		InputStreamReader isr = new InputStreamReader(System.in); // character wise
		BufferedReader br = new BufferedReader(isr); //this class provides readline method to read data
		FileWriter fw = new FileWriter("mno.txt", true);
		String data = "";
		do {
			System.out.println("Enter the data");
			data = br.readLine(); // to read data a line by line
			fw.write(data);
			fw.write("/n");
		} while (!data.equals("end"));
		fw.flush(); // this method is use to send the data from bufer to file
		System.out.println("Data stored");
		
		
		

	}

}
