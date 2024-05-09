package education.main;

import education.school.Attendance; // we can use only Attendance class part of school package
// import education.school.*;  //we can use all classes part of school package.
// import education.college.*;
// import education.college.Attendance;

public class DemoApp {

	public static void main(String[] args) {
		Attendance att1 = new Attendance();
		att1.display();
		education.college.Attendance att2 = new education.college.Attendance();
		att2.display();
	}

}
