
import java.util.Scanner;

public class TakingValueThroughKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter the value of a");
//		int a = sc.nextInt();
//		System.out.println("Enter the value of b");
//		int b = sc.nextInt();
//		int sum = a+b;
//		System.out.println("Sum of two number is "+sum);
		
//		String name = "Steven";
//		System.out.println("name is "+name);
//		System.out.println("Enter the employee details");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();			// scan int value 
//		System.out.println("Enter the name");
//		String fname  = sc.next();		// scan string value but only one word 
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();	// scan float value 
//		System.out.println("id is "+id);
//		System.out.println("name is "+fname);
//		System.out.println("salary is "+salary);
		Scanner sc  = new Scanner(System.in);
		System.out.println("how many number do you want to store");
		int n = sc.nextInt();
			int num[]=new int[n];
		System.out.println("enter the number one by one");
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		int sum=0,esum=0,osum=0;
		for(int a:num) {
			if(a%2==0) {
				esum = esum+a;
			}else {
				osum = osum+a;
			}
			sum = sum +a;
		}
		System.out.println("all numbers are ");
		for(int n1:num) {
			System.out.println(n1);
		}
		System.out.println("sum of natural number "+sum);
		System.out.println("sum of even number "+esum);
		System.out.println("sum of odd number "+osum);
	}

}