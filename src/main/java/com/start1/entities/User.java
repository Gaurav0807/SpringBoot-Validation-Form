package com.start1.entities;

import javax.validation.constraints.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	@NotNull
	@Size(min=3,max=50,message="min 2 and max 20 characters are alllowed !!")
	private String name;
	
	@Email
	private String email;
	
	@Pattern(regexp="[7-9][0-9]{9}",message="invalid mobile number")
	@Size(max=10,message="digits should be 10")
	private String phone;

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
