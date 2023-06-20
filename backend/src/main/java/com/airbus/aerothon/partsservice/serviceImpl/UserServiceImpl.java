package com.airbus.aerothon.partsservice.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.airbus.aerothon.partsservice.util.PasswordHelper;
import com.airbus.aerothon.partsservice.dto.LoginDTO;
import com.airbus.aerothon.partsservice.dto.SessionDTO;
import com.airbus.aerothon.partsservice.dto.SignUpDTO;
import com.airbus.aerothon.partsservice.model.User;
import com.airbus.aerothon.partsservice.repository.UserDao;
import com.airbus.aerothon.partsservice.service.UserService;

import io.micrometer.common.util.StringUtils;

@Service
public class UserServiceImpl implements UserService{

    private Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private PasswordHelper passwordHelper;

    @Autowired
    private UserDao userDao;

    @Override
    public SessionDTO login(LoginDTO loginDTO) {
        LOGGER.debug("Inside signup method: " + loginDTO.toString());
        SessionDTO sessionDTO = new SessionDTO();
        try {
            User user = userDao.getUserByEmail(loginDTO.getEmail());
            String existingHash = user.getHash();
            String existingSalt = user.getSalt();

            byte[] newHash = passwordHelper.getHashWithSalt(loginDTO.getPassword(), passwordHelper.stringToByte(existingSalt));
            String newHashStr = passwordHelper.byteToString(newHash);

            if(existingHash.equals(newHashStr)){
                sessionDTO.setToken(passwordHelper.byteToString(passwordHelper.generateSalt()));
                sessionDTO.setRole("Admin");
                sessionDTO.setMessage("Logged in Successfully");
            }
            else{
                sessionDTO.setMessage("Please check your password");
            }

        } catch (Exception e) {
             LOGGER.error("Exception from login method: ", e);
             sessionDTO.setMessage("Unexpected error occured!");
        }
        return sessionDTO;
    }

    @Override
    public void logout(String username, String password) {

    }

    @Override
    public String signUp(SignUpDTO signUpDTO) {
        LOGGER.info("Inside signup method: " + signUpDTO);
        try {
            User user = new User();
            user.setName(signUpDTO.getName());
            user.setEmail(signUpDTO.getEmail());
            byte[] saltArr = passwordHelper.generateSalt();
            String salt = passwordHelper.byteToString(saltArr);
            user.setSalt(salt);
            byte[] hashArr = passwordHelper.getHashWithSalt(signUpDTO.getPassword(), saltArr);
            String hash = passwordHelper.byteToString(hashArr);
            user.setHash(hash);
            userDao.saveUser(user);
            return "Success";
        } catch (Exception e) {
            LOGGER.error("Exception from signup method: ", e);
        }
        return "Error";
    }
    
}
