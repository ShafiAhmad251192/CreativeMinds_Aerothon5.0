package com.airbus.aerothon.partsservice.dto;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "request")
public class AssignRoleDTO {
    
    private String email;

    private Long roleId;

    @Override
    public String toString() {
        return "AssignRoleDTO [email=" + email + ", role=" + roleId + "]";
    }

}
