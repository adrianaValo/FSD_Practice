
public class ArrayDemo {

	public static void main(String[] args) {
	int a;				// local variable 
	int num1[];		// declaration local variable no default value 
	int num2[]= {10,20,30,40,50,60,80,12,34,56,76,79};	// declaration with initialization 
	//System.out.println(a);
	//System.out.println(num1);
	System.out.println(num2);
	System.out.println(num2[0]);
	System.out.println(num2[1]);
	System.out.println("Size of the array "+num2.length);
	System.out.println("Retrieve value from array using loop one by one");
	for(int i=3;i<6;i++) {
		System.out.println(num2[i]);
	}
	System.out.println("Retreive the element one by one using for enhanched loop");
	for(int n:num2) {
		System.out.println("Value is "+n);
	}
	int num3[]=new int[10];	// memory created.
	System.out.println("Size of array "+num3.length);
	System.out.println(" value of 0 position "+num3[0]);
	System.out.println("value of 9 position "+num3[9]);
	//System.out.println("value of 9 position "+num3[10]);
	num3[0]=100;
	num3[1]=101;
	System.out.println(" value of 0 position "+num3[0]);
	System.out.println("value of 9 position "+num3[1]);
	}

}