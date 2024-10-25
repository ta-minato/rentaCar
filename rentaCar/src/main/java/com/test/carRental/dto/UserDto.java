package com.test.carRental.dto;

import jakarta.validation.constraints.NotEmpty;

public class UserDto {
	@NotEmpty
	private String userName;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String tell;
	
	@NotEmpty
	private String email;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTell() {
		return tell;
	}
	
	public void setTell(String tell) {
		this.tell = tell;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}