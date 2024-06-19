package com.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	// http://locahost:9191/say 
	
	@RequestMapping(value = "say",method = RequestMethod.GET)
	public @ResponseBody String sayHello() {
		return "Welcome to SpringBoot RestAPI";
	}
	
	@RequestMapping(value = "plain",method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public @ResponseBody String sayHelloInPlain() {
		return "<h2>Welcome to SpringBoot RestAPI</h2>";
	}
	
	@RequestMapping(value = "html",method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public @ResponseBody String sayHelloInHtml() {
		return "<h2>Welcome to SpringBoot RestAPI</h2>";
	}
	
	@RequestMapping(value = "xml",method = RequestMethod.GET, produces = MediaType.TEXT_XML_VALUE)
	public @ResponseBody String sayHelloInXml() {
		return "<h2>Welcome to SpringBoot RestAPI</h2>";
	}
}