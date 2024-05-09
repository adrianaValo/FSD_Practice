package interfacetest;

public class BankApp {

	public static void main(String[] args) {
		Hsbc obj1 = new Hsbc();
		Sbi obj2 = new Sbi();
		
		obj1.deposit(100,500);
		obj1.withdraw(101, 400);
		obj1.transferamount(100, 101, 600);
		
		obj2.deposit(100, 500);
		obj2.withdraw(101, 400);
		obj2.transferamount(100, 101, 900);
	}

}
