package interfacetest;

public interface Bank {
	void withdraw(int accno, float amount);
	void deposit(int accno, float amount);
	void transferamount(int to, int from, float amount);
}
