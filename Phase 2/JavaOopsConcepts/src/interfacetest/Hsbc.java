package interfacetest;

public class Hsbc implements Bank {

	@Override
	public void withdraw(int accno, float amount) {
		System.out.println("Hsbc withdrwaw logic");

	}

	@Override
	public void deposit(int accno, float amount) {
		System.out.println("Hsbc deposit logic");

	}

	@Override
	public void transferamount(int to, int from, float amount) {
		System.out.println("Hsbc transfer logic");

	}

}
