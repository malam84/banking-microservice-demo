package com.banking.account.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.account.model.Account;
import com.banking.account.repository.AccountRepository;
import com.banking.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Account createAccount(Account acc) {
		return accountRepository.save(acc);
	}

	@Override
	public Optional<Account> getAccountByAccNo(Integer accNo) {
		Optional<Account> account = accountRepository.getAccountDetailByAccNo(accNo);
		return account;
	}  

}
