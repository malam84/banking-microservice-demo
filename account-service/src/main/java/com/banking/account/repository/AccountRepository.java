package com.banking.account.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.account.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	
	@Query("SELECT a from Account a WHERE a.accountNumber = :accno")
	Optional<Account> getAccountDetailByAccNo(@Param("accno") Integer accNo);
}
