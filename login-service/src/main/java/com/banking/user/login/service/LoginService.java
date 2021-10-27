package com.banking.user.login.service;

import com.banking.user.login.dto.LoginReqDto;

public interface LoginService {
	
	public boolean dologin(LoginReqDto loginReqDto);
	public boolean logout(LoginReqDto loginReqDto);
}
