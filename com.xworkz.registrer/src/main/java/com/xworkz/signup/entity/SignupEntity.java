package com.xworkz.signup.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Entity
@Table(name = "singup_details")
@Data
public class SignupEntity implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "Username")
	private String Username;
	@Column(name = "Email")
	private String Email;
	@Column(name = "Mobile")
	private String Mobile;
	@Column(name = "Password")
	private String Password;
	@Column(name = "ConformPassword")
	private String ConformPassword;


	public SignupEntity() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}


	public SignupEntity(String username, String email, String mobile, String password, String conformPassword) {
		super();
		Username = username;
		Email = email;
		Mobile = mobile;
		Password = password;
		ConformPassword = conformPassword;
	}
	


}
