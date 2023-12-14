package com.satyam.spring.springmvcorm.user.dao;

import java.util.List;

import com.satyam.spring.springmvcorm.user.entity.User;

public interface UserDAO {

	int createUser(User user);

	List<User> findUsers();
	
	User findUser(int id);
}
