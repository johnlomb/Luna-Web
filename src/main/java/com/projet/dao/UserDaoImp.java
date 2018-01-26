package com.projet.dao;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.model.User;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public User getUser(String pseudo, String mdp) {
		Query query = sessionFactory.getCurrentSession().createQuery("from User");
		List<User> list = query.getResultList();
		ListIterator<User> li = list.listIterator();
		while (li.hasNext()) {
			User user = li.next();
			if (user.getMdp().equals(mdp) && user.getPseudo().equals(pseudo)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void del(User user) {
		sessionFactory.getCurrentSession().delete(user);

	}

	@Override
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);

	}

	@Override
	public boolean checkUser(User user) {
		User usercheck = getUser(user.getPseudo(), user.getMdp());
		if (usercheck == null) {
			return false;
		} else
			return true;
	}

}
