package com.banking.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banking.product.model.Product;
import com.banking.product.service.ProductService;

@RestController
@RequestMapping("/productservice")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/create-product", method = RequestMethod.POST)
	public ResponseEntity<Product> createProduct(@RequestBody Product prod){
		return new ResponseEntity<Product>(productService.createProduct(prod), HttpStatus.CREATED);
	}
}
