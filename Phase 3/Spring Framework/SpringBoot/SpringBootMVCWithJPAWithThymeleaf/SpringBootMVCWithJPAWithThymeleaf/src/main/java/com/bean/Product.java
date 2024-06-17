package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
@Scope("prototype")
public class Product {
@Id
private int id;
private String pname;
private float price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String pname, float price) {
	super();
	this.id = id;
	this.pname = pname;
	this.price = price;
}

}