package com.banking.customer.info.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.customer.info.model.Customer;
import com.banking.customer.info.repository.CustomerRepository;
import com.banking.customer.info.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository  custRepository;
	
	@Override
	public Customer createCustomer(Customer cust) {
		return custRepository.save(cust);
	}

	@Override
	public Optional<Customer> getCustomerById(long custId) {
		return custRepository.findById(custId);
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		return null;
	}
}
