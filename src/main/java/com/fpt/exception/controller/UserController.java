package com.fpt.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.exception.entities.User;

@RestController
public class UserController {
	@GetMapping("/")
	public ResponseEntity<Object> view(){
		User user=new User(1, "khanh", "khanh", 10, 76100000);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
}
