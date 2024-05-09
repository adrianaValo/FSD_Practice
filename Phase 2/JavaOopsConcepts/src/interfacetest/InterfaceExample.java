package interfacetest;

interface Abc {
	void dis1();
}

interface Xyz {
	void dis2();
}

interface Mno extends Abc, Xyz {
	void dis3();
}

class Demo implements Abc, Xyz {

	@Override
	public void dis2() {
		System.out.println("Abc interface method");
		
	}

	@Override
	public void dis1() {
		System.out.println("Xyz interface method");
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.dis1();
		obj.dis2();
	}

}
