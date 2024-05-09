package finalkeyword;

final class Bike {
	final void speed() {
		System.out.println("60km/hr");
	}
}

//class Honda extends Bike {
//	@Override
//	void speed() {
//		System.out.println("50km/hr");
//	}
//}

public class FinalExample {

	public static void main(String[] args) {
		int a = 10;
		a = 20;
		final int B = 10;
		//B = 20; --> error

	}

}
