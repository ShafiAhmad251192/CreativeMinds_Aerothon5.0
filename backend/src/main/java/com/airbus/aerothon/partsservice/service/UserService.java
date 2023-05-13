package com.airbus.aerothon.partsservice.service;

import java.util.Map;

import com.airbus.aerothon.partsservice.dto.LoginDTO;
import com.airbus.aerothon.partsservice.model.Users;

public interface UserService {

	Map<String,Object> login(LoginDTO loginDTO);
	Map<String,Object> signUp(Users user);
}
