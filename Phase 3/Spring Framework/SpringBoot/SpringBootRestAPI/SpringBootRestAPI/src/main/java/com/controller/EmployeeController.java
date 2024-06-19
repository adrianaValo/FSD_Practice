package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController						// @Controller + @ResponseBody
public class EmployeeController {

	// http://localhost:9191/employee 
	
	@RequestMapping(value = "employee",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp1 = new Employee(100, "Steven", 34000);
		return emp1;
	}
	
	// http://localhost:9191/employees
	
	@RequestMapping(value = "employees",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		Employee emp1 = new Employee(100, "Steven", 34000);
		Employee emp2 = new Employee(101, "Lex", 38000);
		Employee emp3 = new Employee(102, "John", 45000);
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
	
	// http://localhost:9191/queryparam?name=Adriana
	@RequestMapping(value = "queryparam",method = RequestMethod.GET)
	public String queryParam(@RequestParam("name") String fname) {
		
		return "Welcome user with query param "+fname;
	}
	
	// http://localhost:9191/pathparam/adriana
		@RequestMapping(value = "pathparam/{name}",method = RequestMethod.GET)
		public String pathParam(@PathVariable("name") String fname) {
			return "Welcome user with path param "+fname;
		}
		
		// http://localhost:9191/pathparam/storeEmployee
		@RequestMapping(value = "storeEmployee",
				method = RequestMethod.POST,
				consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeEmployee(@RequestBody Employee emp) {
			System.out.println(emp); // it calls toString method
			// coding to store the data in DB
			
			return "Store data";
		}
}