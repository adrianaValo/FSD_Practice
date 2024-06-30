package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.entity.Login;
import com.service.LoginService;

@ExtendWith(MockitoExtension.class)  // it helps to create mock or fake objects
class LoginControllerTest {
	
	@Mock
	LoginService loginService; // mock for service layer
	
	
	@InjectMocks
	LoginController loginController;  // inject that mock in Dao Layer
 
	@Test
	@Disabled
	void testSignIn() {
		
	}

	@Test
	void testSignUp() {
		
		Login ll = new Login();
		
		ll.setEmailid("maria@example.com");
		ll.setPassword("123");
		// fake result
		Mockito.when(loginService.signUp(ll)).thenReturn("success"); // fake information ready
		
		// testing
		String result = loginController.signUp(ll);
		assertEquals("success", result);
		
	}

}
