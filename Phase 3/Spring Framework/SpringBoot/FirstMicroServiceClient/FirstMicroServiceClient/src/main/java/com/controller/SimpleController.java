package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")   // http://localhost:8181/first/*
public class SimpleController {
	
	@GetMapping(value = "say")
	public String sayHello() {
		return "Welcome to Simple MicroService first client";
	}

}
