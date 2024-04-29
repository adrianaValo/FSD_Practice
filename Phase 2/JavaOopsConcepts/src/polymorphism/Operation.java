package polymorphism;

public class Operation {
	
	void add() {
		System.out.println(10 + 20);
	}
	
	void add(int x) {
		System.out.println(x+ 20);
	}
	
	void add(int x, int y) {
		System.out.println(x + y);
	}
	
	void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}
	
	void add(String x, String y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		
		Operation op = new Operation();
		op.add();
		op.add(2,3);
		op.add(11);
		op.add(1, 2, 3 );
		op.add("1", "2");

	}

}
