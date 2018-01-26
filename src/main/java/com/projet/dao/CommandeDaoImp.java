package com.projet.dao;

import java.util.List;
import java.util.ListIterator;

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
		TypedQuery<Commande> query = sessionFactory.getCurrentSession().createQuery("from Commande");
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

	@Override
	public Commande getCommande(Commande commande) {
		List<Commande> lc=listCommande();
		ListIterator<Commande> li=lc.listIterator();
		while(li.hasNext()) {
			Commande co=li.next();
			if(commande.getIdcommande()==co.getIdcommande()) {
				return co;
			}
		}
		return null;
	}

}
