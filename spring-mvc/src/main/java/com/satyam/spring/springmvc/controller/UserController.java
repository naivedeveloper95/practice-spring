package com.satyam.spring.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.satyam.spring.springmvcorm.user.dao.services.UserService;
import com.satyam.spring.springmvcorm.user.entity.User;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result", "User Created With Id" + result);

		return "userReg";
	}

	@RequestMapping(value = "getUsers", method = RequestMethod.GET)
	public String getUser(ModelMap model) {
		List<User> users = service.findAllUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}
}
