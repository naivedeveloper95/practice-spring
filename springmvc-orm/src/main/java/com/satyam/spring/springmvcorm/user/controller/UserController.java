package com.satyam.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.satyam.spring.springmvcorm.user.dao.services.UserService;
import com.satyam.spring.springmvcorm.user.entity.User;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String showRegistrationPage(@ModelAttribute("user") User user, ModelMap map) {

		int result = userService.save(user);
		map.addAttribute("result", "User created with id " + result);

		return "userReg";
	}

	@RequestMapping(value = "getUsers", method = RequestMethod.GET)
	public String getUser(ModelMap model) {
		List<User> users = userService.findAllUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		User user = userService.findUser(id);
		String msg = "";
		if (user != null) {
			msg = id + " already exists!";
		} else {
			msg = id + " id doesn't exists!";
		}
		return msg;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
