package com.airbus.aerothon.partsservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LoginDTO {

	@NotNull(message = "email is required")
	@NotBlank(message = "email must not be empty")
	String email;
	
	@NotNull(message = "password is required")
	@NotBlank(message = "password must not be empty")
	String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginDTO(@NotNull(message = "email is required") @NotBlank(message = "email must not be empty") String email,
			@NotNull(message = "password is required") @NotBlank(message = "password must not be empty") String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public LoginDTO() {
		super();
	}
	
}
