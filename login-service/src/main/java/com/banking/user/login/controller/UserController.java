package com.banking.user.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banking.user.login.model.User;
import com.banking.user.login.service.UserService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/loginservice")
public class UserController {
	
	@Autowired
    UserService userService;
	
	@RequestMapping(value="/create-user", method=RequestMethod.POST)
	private ResponseEntity<User> createUser(@RequestBody User usr) {
		User user = userService.createUser(usr);
		log.info("User created==>", user);
	  return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
}
