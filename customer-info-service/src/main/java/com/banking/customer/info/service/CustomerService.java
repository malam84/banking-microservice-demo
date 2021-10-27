package com.banking.customer.info.service;

import java.util.Optional;

import com.banking.customer.info.model.Customer;

public interface CustomerService {
	Customer createCustomer(Customer cust);
	Optional<Customer> getCustomerById(long custId);
	Customer getCustomerByEmail(String email);
}
