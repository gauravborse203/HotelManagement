package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.entities.User;
import com.smart.repository.UserRepository;

@Controller
public class HomeController {
      
	 @Autowired
	 private UserRepository  userRepository;
	
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		
		User user=new User();
		user.setName("Gaurav Borse");
		user.setEmail("gaurav@gmail.com");
		userRepository.save(user);
		return "working";
	}
}
