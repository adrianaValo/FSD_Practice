package interfacetest;

public class Sbi implements Bank {

	@Override
	public void withdraw(int accno, float amount) {
		System.out.println("Sbi withdrwaw logic");

	}

	@Override
	public void deposit(int accno, float amount) {
		System.out.println("Sbi deposit logic");

	}

	@Override
	public void transferamount(int to, int from, float amount) {
		System.out.println("Sbi transfer logic");

	}

}
