package com.airbus.aerothon.partsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airbus.aerothon.partsservice.dto.LoginDTO;
import com.airbus.aerothon.partsservice.model.Users;
import com.airbus.aerothon.partsservice.service.UserService;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@Valid @RequestBody Users user){
		
		return new ResponseEntity<>(userService.signUp(user),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@Valid @RequestBody LoginDTO user){
		
		return new ResponseEntity<>(userService.login(user),HttpStatus.OK);
	}
	
}
