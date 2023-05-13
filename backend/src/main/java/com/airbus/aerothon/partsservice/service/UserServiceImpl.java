package com.airbus.aerothon.partsservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbus.aerothon.partsservice.dto.LoginDTO;
import com.airbus.aerothon.partsservice.model.Users;
import com.airbus.aerothon.partsservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public Map<String, Object> login(LoginDTO loginDTO) {
		// TODO Auto-generated method stub
		Map<String,Object>  response = userRepo.findByEmailAndPassword(loginDTO.getEmail(), loginDTO.getPassword());
		if(response == null) {
			response = new HashMap<>();
			response.put("message", "invalid user");
		}
		return response;
	}

	@Override
	public Map<String, Object> signUp(Users user) {
		Map<String,Object> response = new HashMap<String,Object>();
		
		userRepo.saveAndFlush(user);
		response.put("message", "success");
		return response;
	}
	

}
