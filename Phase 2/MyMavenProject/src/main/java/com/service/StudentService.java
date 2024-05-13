package com.service;

import com.bean.Student;
import com.dao.StudentDao;


public class StudentService {
	
	StudentDao sd = new StudentDao();
	
	public String storeStudent(Student student) {
		if(student.getBatch() != 1 && student.getBatch() != 2) {
			return "The provided batch must be 1- morning class, or 2- evening class";
		} else if (sd.storeStudent(student) > 0) {
			return "Student registered successfully";
		} else {
			return "Student not found";
		}
	}
	
	public String updateStudent(Student student) {
		if(student.getBatch() != 1 && student.getBatch() != 2) {
			return "Batch number doesn't exist. Please provide a correct batch: 1 - morning or 2- evening.";
		} else if (sd.updateStudent(student) > 0) {
		
			return "Student batch updated successfully";
			
		} else {
			return "Student with the specified ID doesn't exist";
	} 
	}
	
	public String deleteStudent(int pid) {
		if(sd.deleteStudent(pid) > 0) {
			return "Student batch updated successfully";
		} else {
			return 
				"Student not found";
			
		}
	}

}
