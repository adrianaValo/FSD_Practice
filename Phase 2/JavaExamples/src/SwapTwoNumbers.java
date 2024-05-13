
public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		System.out.println("Before swapping the values are: " +a + " " +b);
		
		// Logic 1: The third variable
		
//		int t = a;
//		a = b;
//		b = t;
		
		// Logic 2 : Use  + and - operators, without using 3rd variable
		
//		a = a + b; //30
//		b = a - b; // 10
//		a = a - b; // 20
		
		// Logic 3: Use * and /
		// a and b should not be 0
		
		a = a * b; // 200
		b = a / b; // 10
		a = a / b; // 20
		
		
		
		System.out.println("After the swapping the values are: " +a + " " +b);
		

	}

}
