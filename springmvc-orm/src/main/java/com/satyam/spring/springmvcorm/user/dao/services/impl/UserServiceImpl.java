package com.satyam.spring.springmvcorm.user.dao.services.impl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satyam.spring.springmvcorm.user.dao.UserDAO;
import com.satyam.spring.springmvcorm.user.dao.services.UserService;
import com.satyam.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public int save(User user) {
		int result = userDAO.createUser(user);
		return result;
	}

	@Override
	public List<User> findAllUsers() {
		List<User> usersList = userDAO.findUsers();
		Collections.sort(usersList);
		return usersList;
	}

	@Override
	public User findUser(int id) {
		return userDAO.findUser(id);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
