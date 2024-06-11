package com;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;

//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		//Resource res  = new ClassPathResource("beans.xml"); // load the xml file 
		//BeanFactory obj = new XmlBeanFactory(res);   // get beanfactory interface reference. 
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Address add = (Address)ac.getBean("address"); // id is address by default class name
//		System.out.println(add); // it will call toString method
//		add.setCity("Constanta");
//		add.setState("Romania");
//		System.out.println(add);
//		Employee emp = (Employee)ac.getBean("employee");
//		System.out.println(emp);
		
	//	Without XML File
		// this class to load configuration class
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Address add = (Address)ac.getBean("address"); // id is by default class name
		System.out.println(add); // it will call toString method
		add.setCity("Bucharest");
		add.setState("Romania");
		System.out.println(add);
		
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		
		
		
	}

}
