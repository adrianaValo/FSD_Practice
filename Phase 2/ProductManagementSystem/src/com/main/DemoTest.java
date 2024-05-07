package com.main;

import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String con;
		int choice;
		int pid;
		String pname;
		float price;
		String result;
		ProductService ps = new ProductService();
	
		do {
			System.out.println("1: Add Product 2: Display Product");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) 
			{
			case 1: System.out.println(" Enter product ID");
			pid = sc.nextInt();
			System.out.println("Enter the product name");
			pname = sc.next();
			System.out.println("Enter the price");
			price = sc.nextFloat();
			
			Product p1 = new Product(pid, pname, price);
			
			result = ps.addProduct(p1);
			System.out.println(result);
			break;
			
			case 2: List<Product> listOfProduct = ps.findAllproducts();
			
				for(Product p : listOfProduct) {
					System.out.println(p);
				}
				
				break;
				
			default : System.out.println("Wrong choice");
			break;
			
			}
			System.out.println("Do you want to continue(y/n)?");
			con = sc.next();
		
	} while (con.equals("y"));

}
	
}
