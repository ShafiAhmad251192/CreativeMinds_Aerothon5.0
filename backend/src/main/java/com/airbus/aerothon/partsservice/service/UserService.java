package com.airbus.aerothon.partsservice.service;


import com.airbus.aerothon.partsservice.dto.AssignRoleDTO;
import com.airbus.aerothon.partsservice.dto.LoginDTO;
import com.airbus.aerothon.partsservice.dto.SessionDTO;
import com.airbus.aerothon.partsservice.dto.SignUpDTO;

public interface UserService {
    
    public SessionDTO login(LoginDTO loginDTO);

    public void logout(String username, String password);

    public String signUp(SignUpDTO signUpDTO);

    public String assignRole(AssignRoleDTO assignRoleDTO);
}
