package com.banking.customer.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.customer.info.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
