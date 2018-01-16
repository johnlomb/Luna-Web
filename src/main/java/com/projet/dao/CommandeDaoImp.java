package com.projet.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.model.Commande;

@Repository
public class CommandeDaoImp implements CommandeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void add(Commande commande) {
		sessionFactory.getCurrentSession().save(commande);

	}

	@Override
	public List<Commande> listCommande() {
		@SuppressWarnings("unchecked")
		TypedQuery<Commande> query = sessionFactory.getCurrentSession().createQuery("from COMMANDES");
		return query.getResultList();
	}

	@Override
	public void del(Commande commande) {
		sessionFactory.getCurrentSession().delete(commande);

	}

	@Override
	public void update(Commande commande) {
		sessionFactory.getCurrentSession().update(commande);

	}

}
