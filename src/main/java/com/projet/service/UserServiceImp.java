package com.projet.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.dao.UserDao;
import com.projet.model.User;
@Service
@Transactional
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao userDao;
	@Override
	public void add(User user) {
		userDao.add(user);

	}

	@Override
	public User getUser(String pseudo, String mdp) {
		return userDao.getUser(pseudo, mdp);
	}

	@Override
	public void del(User user) {
		userDao.del(user);

	}

	@Override
	public void update(User user) {
		userDao.update(user);

	}

}
