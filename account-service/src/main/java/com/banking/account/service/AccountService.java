package com.banking.account.service;

import java.util.Optional;

import com.banking.account.model.Account;

public interface AccountService {
	
	Account createAccount(Account acc);
	Optional<Account> getAccountByAccNo(Integer accNo);
}
