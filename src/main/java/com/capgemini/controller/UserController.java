package com.capgemini.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.model.User;
import com.capgemini.service.UserService;

@RestController
public class UserController {
	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user) {
	LOG.info("Controller register");
	User us = userService.registerUser(user); // line 
	HttpHeaders headers = new HttpHeaders();
	headers.add("message", "This user is added to the database.");
	LOG.info(headers.toString());
	ResponseEntity<User> response = new ResponseEntity<>(us, headers, HttpStatus.OK);
	return response;
}

	@GetMapping("/login")
	public ResponseEntity<User> login(@RequestBody String UserName,String Password) {
	LOG.info("Controller Login");
	User us = userService.login(UserName,Password); // line 
	HttpHeaders headers = new HttpHeaders();
	headers.add("message", "This user is added to the database.");
	LOG.info(headers.toString());
	ResponseEntity<User> response = new ResponseEntity<User>(us, headers, HttpStatus.OK);
	return response;
}

	@GetMapping("/forgot password")
	public ResponseEntity<User> forgotpassword(@RequestBody User user) {
	LOG.info("Controller fogotpassword");
	User us = userService.forgotpassword(user); // line 
	HttpHeaders headers = new HttpHeaders();
	headers.add("message", "This user is added to the database.");
	LOG.info(headers.toString());
	ResponseEntity<User> response = new ResponseEntity<User>(us, headers, HttpStatus.OK);
	return response;
}

	
	
	
	}
	
	
	
	
	
	

