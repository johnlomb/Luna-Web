package com.projet.dao;

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
	public User getUser(String pseudo,String mdp) {
		Query query = sessionFactory.getCurrentSession().createQuery("from USERS where PSEUDO= "+pseudo+"and MOT_DE_PASSE="+mdp);
		return (User)query.getSingleResult();

	}

	@Override
	public void del(User user) {
		sessionFactory.getCurrentSession().delete(user);

	}

	@Override
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);

	}

}
