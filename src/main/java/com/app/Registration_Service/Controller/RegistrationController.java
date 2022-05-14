package com.app.Registration_Service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.Registration_Service.Entity.User;
import com.app.Registration_Service.Service.RegistrationService;

public class RegistrationController {
	
	@Autowired
	private RegistrationService registerService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user)
	{
		User userObj=null;
		userObj= registerService.saveUser(user);
		return userObj;
	}

}
