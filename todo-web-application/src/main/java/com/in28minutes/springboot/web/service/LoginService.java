package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		
		
		
		return (userid.equalsIgnoreCase("user 1")
				&& password.equalsIgnoreCase("123456"))
			  || (userid.equalsIgnoreCase("test")
						&& password.equalsIgnoreCase("test123"))
			  || (userid.equalsIgnoreCase("eve")
						&& password.equalsIgnoreCase("eve@123"))
				;
	}

}