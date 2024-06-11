package com.main;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	
//Employee emp1 = new Employee();
//	emp1.setId(101);
//emp1.setName("Maria");
//emp1.setSalary(35000);
//
//tran.begin();	
//manager.persist(emp1);   // save the record ie insert query 
//tran.commit();
//	System.out.println("Record inserted...");
	
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
//	Employee emp2 = manager.find(Employee.class, 102);	// select * from employee where id  = 101;
//	if(emp2==null) {
//		System.out.println("No record present");
//	}else {
//		System.out.println(emp2);
//	}
//	
	
	
	// retrieve all the records
	
//	Query qry = manager.createQuery("select emp from Employee emp");
//	List<Employee> listOfEmp = qry.getResultList();
//	//System.out.println("Number of records " + listOfEmp.size());
//	Iterator<Employee> li = listOfEmp.iterator();
//	while(li.hasNext()) {
//		Employee emp = li.next();
//		System.out.println(emp);
//	}
//	
//	}
	
	// retrieve all records from database using where clause
	// value static or fixed
	//Query qry=	manager.createQuery("select emp from Employee emp where emp.id=100");
	//Query qry=	manager.createQuery("select emp from Employee emp where emp.salary>36000");
		
	// value dynamic using ? 
	//Query qry=	manager.createQuery("select emp from Employee emp where emp.id=?2");
	//qry.setParameter(2, 100);
	
	// value dynamic using label 
//		Query qry=	manager.createQuery("select emp from Employee emp where emp.id=:empid");
//		qry.setParameter("empid", 101);
//		
//		List<Employee> listOfEmp = qry.getResultList();
//		//System.out.println("Number of records "+listOfEmp.size());
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp = li.next();
//			System.out.println(emp);
	
	// retrieve partial objects like only id
//	Query  qry = manager.createQuery("select emp.id from Employee emp");
//	List<Integer>  listOfEmp = qry.getResultList();
//	Iterator<Integer> li = listOfEmp.iterator();
//	while(li.hasNext()) {
//		int id  = li.next();
//		System.out.println(id);
//		}
	
	// retrieve partial objects like only name
//	Query  qry = manager.createQuery("select emp.name from Employee emp");
//	List<String>  listOfEmp = qry.getResultList();
//	Iterator<String> li = listOfEmp.iterator();
//	while(li.hasNext()) {
//		String name  = li.next();
//		System.out.println(name);
//	}	
	
	// retrieve partial objects, but more than one like only name, salary
	// the same code applies for join query
		Query  qry = manager.createQuery("select emp.name, emp.salary from Employee emp");
		List<Object[]>  listOfEmp = qry.getResultList();
		Iterator<Object[]> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Object obj[] = li.next();
			System.out.println("Name is  "+obj[0] +" Salary is "+obj[1]);
			
		}
	
	}
} 