package com.airbus.aerothon.partsservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_generator")
	@SequenceGenerator(name = "user_seq_generator", sequenceName = "users_seq", allocationSize = 1)
	Long id;
	Long userId;
	Long partId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPartId() {
		return partId;
	}
	public void setPartId(Long partId) {
		this.partId = partId;
	}
	public Assignment(Long id, Long userId, Long partId) {
		super();
		this.id = id;
		this.userId = userId;
		this.partId = partId;
	}
	public Assignment() {
		super();
	}
	
	
}
