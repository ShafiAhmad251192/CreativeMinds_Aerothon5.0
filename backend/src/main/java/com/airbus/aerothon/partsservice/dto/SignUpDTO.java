package com.airbus.aerothon.partsservice.dto;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(namespace = "request")
public class SignUpDTO {
    
    private String name;
    
    private String email;

    private String password;

    @Override
    public String toString() {
        return "SignUpDTO [name=" + name + ", email=" + email + ", password=" + password + "]";
    }

}