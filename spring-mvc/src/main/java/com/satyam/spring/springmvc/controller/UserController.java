package com.satyam.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.satyam.spring.springmvc.dto.User;

@Controller
public class UserController {

	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String showRegistrationPage(@ModelAttribute("user") User user, ModelMap map) {
		System.out.println(user);
		map.addAttribute("user", user);

		return "regResult";
	}
}
