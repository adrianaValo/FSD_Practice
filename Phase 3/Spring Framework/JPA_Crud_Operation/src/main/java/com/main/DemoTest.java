package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	// peristence unit name present in persistence.xml file which 
		// hold entity class as well as database details. 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Crud_Operation");
	System.out.println("loaded persistence unit name");
	// Entity Manager factory is like Connection in JDBC. 
	EntityManager manager = emf.createEntityManager(); // it is like a Statement or PreparedStatement. 
	EntityTransaction tran = manager.getTransaction();		// get transaction object. 
	// insert record 
Employee emp1 = new Employee();
	emp1.setId(101);
emp1.setName("Maria");
emp1.setSalary(35000);

tran.begin();	
manager.persist(emp1);   // save the record ie insert query 
tran.commit();
	System.out.println("Record inserted...");
	
	// Delete Query 
//	Employee emp1 = manager.find(Employee.class, 100);	// select * from employee where id  = 101;
//	if(emp1==null) {
//		System.out.println("No record present");
//	}else {
//		tran.begin();
//		manager.remove(emp1);			// like delete query 
//		tran.commit();
//		System.out.println("Record deleted successfully");
//	}
	
	
	// update Query 
//		Employee emp1 = manager.find(Employee.class, 100);	// select * from employee where id  = 101;
//		if(emp1==null) {
//			System.out.println("No record present");
//		}else {
//			tran.begin();
//			emp1.setSalary(35000);
//			manager.merge(emp1);				// update query 
//			tran.commit();
//			System.out.println("Record updated successfully");
	
			
			// select query with id condition
	Employee emp2 = manager.find(Employee.class, 102);	// select * from employee where id  = 101;
	if(emp2==null) {
		System.out.println("No record present");
	}else {
		System.out.println(emp2);
	}
	}

}