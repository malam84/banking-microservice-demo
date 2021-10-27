package com.banking.user.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banking.user.login.dto.LoginReqDto;
import com.banking.user.login.service.LoginService;

@RestController
@RequestMapping("/loginservice")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public  ResponseEntity<Boolean>login(@RequestBody LoginReqDto loginReqDto) {
		return new ResponseEntity<Boolean>(loginService.dologin(loginReqDto), HttpStatus.OK);
	}
	
	public void logout() {
		
	}

}
