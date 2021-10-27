package com.banking.customer.info.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banking.customer.info.exception.RecordNotFoundException;
import com.banking.customer.info.model.Customer;
import com.banking.customer.info.service.CustomerService;

@RestController
@RequestMapping("/customerservice")
public class CustomerController {
	
	@Autowired
	CustomerService custService;
	
	@RequestMapping(value="/create-customer", method=RequestMethod.POST)
	public ResponseEntity<Customer> createCustomerInformation(@RequestBody Customer customer){
		Customer cust = custService.createCustomer(customer);
		return new ResponseEntity<Customer>(cust, HttpStatus.CREATED);	
	}
	
	@RequestMapping(value="/customerbyid", method=RequestMethod.GET)
	public ResponseEntity<Customer> getCustomerInfoById(@RequestParam long custId){
		Optional<Customer> cust = custService.getCustomerById(custId);
		if (cust.isPresent()) {
		    return new ResponseEntity<Customer>(cust.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Invalid customer id " + custId);
	    }
	}
	
	@RequestMapping(value="/customerbyemail", method=RequestMethod.POST)
	public ResponseEntity<Customer> getCustomerInfoByEmail(@RequestParam long email){
		return null;	
	}
}
