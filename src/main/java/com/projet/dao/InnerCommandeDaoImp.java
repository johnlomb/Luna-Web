package com.projet.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.projet.model.InnerCommande;

@Repository
public class InnerCommandeDaoImp implements InnerCommandeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(InnerCommande innerCommande) {
		sessionFactory.getCurrentSession().save(innerCommande);

	}

	@Override
	public List<InnerCommande> ListInCommande() {
		@SuppressWarnings("unchecked")
		TypedQuery<InnerCommande>query=sessionFactory.getCurrentSession().createQuery("from InnerCommande");
		return query.getResultList();
		
	}

	@Override
	public void del(InnerCommande innerCommande) {
		sessionFactory.getCurrentSession().delete(innerCommande);

	}

	@Override
	public void update(InnerCommande innerCommande) {
		sessionFactory.getCurrentSession().update(innerCommande);

	}

}
