package com.tonny.study.hadoop.rpc.service;

import com.tonny.study.hadoop.rpc.protocol.IUserLoginService;

public class UserLoginServiceImpl implements IUserLoginService {

	public String login(String name, String passwd) {
		
		return name + "logged in successfully...";
	}
	
	
	

}
