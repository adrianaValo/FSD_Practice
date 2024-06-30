package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;
	
	public String signIn(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			Login ll = result.get();
			if(ll.getPassword().equals(login.getPassword())) {
				return "Success";
		} else {
			
			return "Password is wrong";
		}
		} else {
			return "E-Mail ID is wrong";
		}
	}
	
		
	
	
	public String signUp(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			return "Email-ID must be unique";
		} else {
			loginRepository.save(login);
			return "Account created successfully";
		}
	}

}
