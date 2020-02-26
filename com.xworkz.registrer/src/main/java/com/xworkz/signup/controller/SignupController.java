package com.xworkz.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.signup.dto.SignupDTO;
import com.xworkz.signup.service.SignupService;

@Controller
@RequestMapping
public class SignupController {
	@Autowired
	private SignupService signupService;
	
	public SignupController() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}
	@RequestMapping("/Signup.do")
	public String onSignup(SignupDTO signupDTO,ModelMap map) {
		
		try {
			System.out.println("invoked onSignup");
			boolean check = this.signupService.validateAndSave(signupDTO);
			if (check) {
				map.addAttribute("Signup.jsp", "Data saved");
			} else {
				map.addAttribute("Signup.jsp", "Data not saved");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/Signup.jsp";
	}
}
