package com.airbus.aerothon.partsservice.model;

import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "role", schema = "iam_schema")
@Where(clause = "is_deleted = 0")
public class Role {
    
    @Column(name = "pk_role_id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long pkRoleId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "is_deleted")
    private Boolean isDeleted;
}
