package com.xworkz.signup.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.signup.dao.SignupDAO;
import com.xworkz.signup.dto.SignupDTO;
import com.xworkz.signup.entity.SignupEntity;
@Service
public class SignupServiceImpl implements SignupService{
	@Autowired
	private SignupDAO signupDAO;
	
	public SignupServiceImpl() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public boolean validateAndSave(SignupDTO signupDTO) {
		boolean valid = false;
		try {
			System.out.println("save invoked " + signupDTO);

			if(Objects.nonNull(signupDTO)) {
				System.out.println("starting validation for " + signupDTO);
				String Username = signupDTO.getUsername();
				if (Username !=null && !Username.isEmpty() && Username.length() >=5) {
				System.out.println("Username is valid");
				valid = true;
				} else {
					System.out.println("Username is invalid");
					if(Username == null) {
						System.out.println("Username is null");
					}
					if(Username !=null && Username.length() <5) {
						System.out.println("name length is less than 5");
					}
					valid = false;
				}
		
				String Email = signupDTO.getEmail();
				if (Email !=null && !Email.isEmpty() && Email.length() >=5) {
					System.out.println("Email is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("Email is invalid");
					valid = false;
					
				}
			}
			
				String Password = signupDTO.getPassword();
				if (Password !=null && !Password.isEmpty() && Password.length() >=5) {
					System.out.println("Password is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("Password is invalid");
					valid = false;
					
				}
			}
			
				String ConformPassword = signupDTO.getConformPassword();
				if (ConformPassword !=null && !ConformPassword.isEmpty() && ConformPassword.length() >=5) {
					System.out.println("ConformPassword is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("ConformPassword is invalid");
					valid = false;
				}		
		}
			}
			//return valid;
			
			if(valid) {
				System.out.println("Data is valid ,will convert  to entity");
				
				SignupEntity signupEntity = new SignupEntity();
				
				BeanUtils.copyProperties(signupDTO, signupEntity);
				
				System.out.println("entity is ready \t "+ signupEntity);
				signupDAO.save(signupEntity);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
		
	}


