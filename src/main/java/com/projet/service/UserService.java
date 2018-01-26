package com.projet.service;

import com.projet.model.User;

public interface UserService {
	void add(User user);

	User getUser(String pseudo, String mdp);

	void del(User user);

	void update(User user);
	boolean checkUser(User user);
}
