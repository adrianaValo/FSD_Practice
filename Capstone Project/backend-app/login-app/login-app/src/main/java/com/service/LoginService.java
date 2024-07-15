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
	
	public String signUp(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			return "Account already exists, account didn't create";
		}else if(login.getTypeofuser().equals("admin")) {
			return "You can't create admin account";
		}else {
			loginRepository.save(login);
			return "Account created successfully";
		}
	}
	
	public String signIn(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		
		if(result.isPresent()) {
		
			Login ll = result.get();
			if(ll.getPassword().equals(login.getPassword())) {
			
				if(ll.getTypeofuser().equals("admin") && login.getTypeofuser().equals("admin")) {
					return "Admin login successfully";
				}else if(ll.getTypeofuser().equals("customer") && login.getTypeofuser().equals("customer")){
					return "Customer login successfully";
				}else {
					return "Invalid type of User";
				}
			
			}else {
				return "Password is wrong";
			}
		
		}else {
			return "EmailId is wrong";
		}
	}

	
}