package com.projet.dao;

import java.util.List;

import com.projet.model.User;


public interface UserDao {
	void add(User user);
	User getUser(String pseudo,String mdp);
	void del(User user);
	void update(User user);
	boolean checkUser(User user);
}
