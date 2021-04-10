package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.ModelUser;
import com.user.service.ServiceUser;

@RestController
@RequestMapping("/user")
public class ControllerUser {

	@Autowired
	ServiceUser userService;
	
	@PostMapping("/add")
	public ModelUser createUser(@RequestBody ModelUser user) {
		 userService.createUser(user);
		 return user;
	}
	
	@GetMapping("/get/{email}")
	public ModelUser getUser(@PathVariable String email) {
		return userService.findUser(email);
	}
	
	@PutMapping("/update/{email}")
	public void updatUser(@PathVariable String email, @RequestBody ModelUser user) {
		userService.updateUser(email, user);
	}
	
	@DeleteMapping("/delete/{email}")
	public void deleteUser(@PathVariable String email) {
		userService.deleteUser(email);
	}
	
}
