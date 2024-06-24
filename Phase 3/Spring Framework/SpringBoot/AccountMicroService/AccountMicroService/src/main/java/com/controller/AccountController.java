package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Account;
import com.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	@GetMapping(value = "findbyaccno/{accno}")
	public String findBalanceByAccno(@PathVariable("accno") int accno) {
		return accountService.findBalanceByaccno(accno);
	}
	
	@GetMapping(value = "findbyemail/{emailid}")
	public String findBalanceByEmailId(@PathVariable("emailid") String emailid) {
		return accountService.findBalanceEmailid(emailid);
	}
	
	@GetMapping(value = "findaccno/{emailid}")
	public int findAccounNumber(@PathVariable("emailid") String emailid) {
		try {
		return accountService.findAccno(emailid);
		}catch(Exception e) {
			System.err.println(e);
			return -1;
		}
	}
}