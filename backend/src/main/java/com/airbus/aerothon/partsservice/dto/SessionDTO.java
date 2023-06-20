package com.airbus.aerothon.partsservice.dto;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "user")
public class SessionDTO {
    
    private String token;

    private String role;

    private String message;
    
}
