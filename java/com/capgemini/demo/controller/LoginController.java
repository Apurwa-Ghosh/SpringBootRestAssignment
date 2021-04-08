package com.capgemini.demo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping(value="/authentication")
	public String loginMethod( @RequestHeader(name="username", required = true) String username, @RequestHeader(name="password", required = true) String password) throws Exception
	{

		if(username.equals("ADMIN") && password.equals("admin"))
		return "Authentiation successful. Welcome to DEMO Application!";
		else
			return "login failed";
	}

}
