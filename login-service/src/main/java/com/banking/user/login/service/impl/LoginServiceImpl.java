package com.banking.user.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.user.login.dto.LoginReqDto;
import com.banking.user.login.model.User;
import com.banking.user.login.repository.LoginRepository;
import com.banking.user.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public boolean dologin(LoginReqDto loginReqDto) {
		
		Boolean exstUser=loginRepository.chkUserExist(loginReqDto.getUserName());
		if(!exstUser)
		{
			return false;
		}
		
		User user = loginRepository.fetchUserByUserName(loginReqDto.getUserName());
		if(loginReqDto.getPassword().equals(user.getPassword()))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean logout(LoginReqDto loginReqDto) {
		return false;
	}

}
