package com.satyam.spring.springmvcorm.user.dao.services;

import java.util.List;

import com.satyam.spring.springmvcorm.user.entity.User;

public interface UserService {

	int save(User user);
	
	List<User> findAllUsers();
	
	User findUser(int id);
}
