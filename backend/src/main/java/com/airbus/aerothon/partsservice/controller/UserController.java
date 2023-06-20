package com.airbus.aerothon.partsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airbus.aerothon.partsservice.dto.LoginDTO;
import com.airbus.aerothon.partsservice.dto.SessionDTO;
import com.airbus.aerothon.partsservice.dto.SignUpDTO;
import com.airbus.aerothon.partsservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO){
        return new ResponseEntity<SessionDTO>(userService.login(loginDTO), HttpStatus.OK);
    }

    @PostMapping("/logout")
    public void logout(String userName, String password){
        userService.logout(userName, password);
    }

    @PostMapping(value = "/signup", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> signup(@RequestBody SignUpDTO signupDTO){
        return new ResponseEntity<String>(userService.signUp(signupDTO), HttpStatus.OK);
    }
}
