package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		Optional<Account> result = accountRepository.findById(account.getAccno());
		if(result.isPresent()) {
			return "account already exists";
		}else {
			accountRepository.save(account);
			return "Account created";
		}
	}
	public String findBalanceByaccno(int accno) {
		Optional<Account> result = accountRepository.findById(accno);
		if(result.isPresent()) {
			Account acc = result.get();
			return "Your balance amount is "+acc.getAmount();
		}else {
			return "Invalid account number";
		}
	}
	
	public String findBalanceEmailid(String emailid) {
		return "Your balance is "+accountRepository.findBalance(emailid);
	}
	
	public int findAccno(String emailid) {
		return accountRepository.findAccnumber(emailid);
	}
}