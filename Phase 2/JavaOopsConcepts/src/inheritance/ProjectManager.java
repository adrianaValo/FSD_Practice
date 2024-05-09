package inheritance;

public class ProjectManager extends Manager {
	private String clientName;
	
	void readPmgr() {
		readMgr();
		System.out.println("Enter the client name");
		clientName = sc.next();
	}
	
	void disPmgr() {
		disMgr();
		System.out.println("Client name is " + clientName);
	}

}
