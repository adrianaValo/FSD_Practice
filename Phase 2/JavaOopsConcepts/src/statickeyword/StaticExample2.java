package statickeyword;

class Employee {
	int eid;
	static int mid;
	
	void dis() {
		System.out.println(" Employee ID " + eid);
		System.out.println("Manager ID " + mid);
	}
}

public class StaticExample2 {

	public static void main(String[] args) {

		Employee emp1 = new Employee();  //heap memory or instance memory 
		Employee emp2 = new Employee();
		emp1.eid = 100;
		emp1.mid = 200;
		Employee.mid = 300;
		
		emp2.eid = 400;
		emp2.mid = 500;
		Employee.mid = 600;
		
		emp1.dis();
		emp2.dis();

	}

}
 