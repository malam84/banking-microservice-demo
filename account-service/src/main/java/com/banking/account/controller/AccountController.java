package com.banking.account.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banking.account.exception.RecordNotFoundException;
import com.banking.account.model.Account;
import com.banking.account.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService 	accountService;
	
	@RequestMapping(value="/create-account", method=RequestMethod.POST)
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		Account acc = accountService.createAccount(account);
		return new ResponseEntity<Account>(acc, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/accountinfobyno", method=RequestMethod.GET)
	public ResponseEntity<Account> fetchAccountByNumber(@RequestParam Integer accNo){
		Optional<Account> account = accountService.getAccountByAccNo(accNo);
		if(account.isPresent()) {
			return new ResponseEntity<Account>(account.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Account no not exist " + accNo);
		}
	}
}
