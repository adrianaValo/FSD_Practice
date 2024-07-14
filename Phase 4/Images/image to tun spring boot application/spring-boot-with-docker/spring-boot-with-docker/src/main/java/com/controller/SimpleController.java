package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(value = "/") // http://localhost:9090/
	public String greeting() {
		return "Welcome to SpringBoot with Docker created by Adriana";
	}
	
	@GetMapping(value = "say/{name}") // http://localhost:9090/say/adriana
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome to SpringBoot with Docker created by " + name;
	}

}
