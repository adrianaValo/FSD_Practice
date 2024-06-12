package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(value = "signin",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req, Login login) {  // di for login as well as request 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		login.setEmailid(emailid);
		login.setPassword(password);
		
		ModelAndView mav = new ModelAndView();
		
		String result = loginService.signIn(login);
		if(result.equals("success")) {
			mav.addObject("msg", emailid);
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	
	@RequestMapping(value = "signup",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req, Login login) {  // di for login as well as request 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		login.setEmailid(emailid);
		login.setPassword(password);
		
		ModelAndView mav = new ModelAndView();
		
		String result = loginService.signUp(login);
		
		mav.addObject("msg", result);
		
		mav.setViewName("signup.jsp");
		
		return mav;
	}
}