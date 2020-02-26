package com.xworkz.signup.dto;

public class SignupDTO {

	private String Username;
	private String Email;
	private String Mobile;
	private String Password;
	private String ConformPassword;
	
	public SignupDTO() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConformPassword() {
		return ConformPassword;
	}

	public void setConformPassword(String conformPassword) {
		ConformPassword = conformPassword;
	}

	@Override
	public String toString() {
		return "SignupDTO [Username=" + Username + ", Email=" + Email + ", Mobile=" + Mobile + ", Password=" + Password
				+ ", ConformPassword=" + ConformPassword + "]";
	}
	
}
