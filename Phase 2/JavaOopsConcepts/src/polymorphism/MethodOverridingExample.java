package polymorphism;

class Bike {
	void speed() {
		System.out.println("60km/h");
	}
	
}
	
	class Honda extends Bike {
		@Override
		void speed() {
			
			System.out.println("50km/h");
		}
		void color() {
			System.out.println("Black");
		}
	}
	
	class Pulsar extends Bike {
		
		void color() {
			System.out.println("Gray");
		}
		@Override
		void speed() {
			System.out.println("90km/h");
		}
	}


public class MethodOverridingExample {
	public static void main(String[] args) {
		Honda hh = new Honda();
		hh.color(); hh.speed();
		Pulsar pu = new Pulsar();
		pu.color(); pu.speed();
	}

}
