package statickeyword;

class Abc {
	int a;  // instance or non static variable
	static int b; //static variable
	
	void dis1() {
		System.out.println(" Non static method");
		System.out.println("a " + a);
		System.out.println("b " + b);
	}
	
	static void dis2() {
		System.out.println(" Static method");
		// System.out.println("a " + a);
		System.out.println("b " + b);
	}
}

public class StaticExample1 {

	public static void main(String[] args) {
		
		Abc obj1 = new Abc();
		obj1.a = 10;
		Abc.b = 20;  // static variable
		obj1.dis1();  
		Abc.dis2(); //static method
		obj1.b = 30;
		obj1.dis2();
		
	}

}
