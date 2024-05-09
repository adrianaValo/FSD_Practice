package abstractdemo;



abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("50km/lt");
	}
}
	
	class Honda extends Bike {
		@Override
		void mailage() {
			System.out.println("70km/lt");
		}
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
	
	class Tvs extends Bike {
		void color() {
			System.out.println("Gray");
		}
		
		@Override
		void mailage() {
			super.mailage();   //calling super class mailage method
			System.out.println("20km/lt");
		}
		@Override
		void speed() {
			System.out.println("90km/h");
		}
	}


public class AbstractExample {

	public static void main(String[] args) {
		Honda hh =  new Honda();   hh.color();  hh.speed(); hh.mailage();
		Pulsar pu = new Pulsar(); pu.color(); pu.speed();  pu.mailage();
		Tvs tv = new Tvs();   tv.color();   tv.speed();   tv.mailage();
		
		
	}

}
