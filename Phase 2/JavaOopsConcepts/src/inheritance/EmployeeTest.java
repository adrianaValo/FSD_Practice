package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("Developer info ");
		Developer d = new Developer();
		//d.readEmp();
		d.readDev();
		//d.disEmp();
		d.disDev();
		
		System.out.println("Manager info");
		Manager m = new Manager();
		//m.readEmp();
		m.readMgr();
		//m.disEmp();
		m.disMgr();
		
		System.out.println("Project Manager info");
		ProjectManager pm = new ProjectManager();
		//pm.readEmp();
		//pm.readMgr();
		pm.readPmgr();
		//pm.disEmp();
		//pm.disMgr();
		pm.disPmgr();

	}

}
