package com.pms.main;

import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		String result;
		int pid;
		String pname;
		float price;
		String con = "";
		int choice;
		do {
			System.out.println("1:Add Product 2: Update Product 3: Delete product 4 : View All Product");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the pid");
				pid = sc.nextInt();
				System.out.println("Enter the pname");
				pname = sc.next();
				System.out.println("Enter the price");
				price = sc.nextFloat();
				Product p1 = new Product(pid, pname, price);
				result = ps.storeProduct(p1);
				System.out.println(result);
				break;
			
			case 2:System.out.println("Enter the pid");
				pid = sc.nextInt();
				System.out.println("Enter the price");
				price = sc.nextFloat();
				Product p2 = new Product();
				p2.setPid(pid);
				p2.setPrice(price);
				result = ps.updateProduct(p2);
				System.out.println(result);
				break;
			
			case 3:System.out.println("Enter the pid");
				  pid = sc.nextInt();
				 result = ps.deleteProduct(pid);
				 System.out.println(result);
				 break;	
			case 4 : List<Product> listOfProdut = ps.findAllProduct();
					for(Product p : listOfProdut) {
						System.out.println(p);
					}
					break;
			default:System.out.println("Wrong choice");
				break;
			}
			
			System.out.println("do you want to continue(y/n)");
			con = sc.next();
		}while(con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");
	}

}