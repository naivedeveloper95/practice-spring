package com.satyam.spring.springmvcorm.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.satyam.spring.springmvcorm.user.dao.UserDAO;
import com.satyam.spring.springmvcorm.user.entity.User;

@Repository
public class UserDaoImpl implements UserDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int createUser(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User findUser(int id) {
		return hibernateTemplate.get(User.class, id);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
