package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")   // http://localhost:8282/second/say
public class SimpleController {

		@GetMapping(value = "say")
		public String sayHello() {
			return "Welcome to second Microservice client";
		}
}
