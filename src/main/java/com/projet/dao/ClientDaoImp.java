package com.projet.dao;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.model.Client;

@Repository
public class ClientDaoImp implements ClientDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(Client client) {
		sessionFactory.getCurrentSession().save(client);
		
	}

	@Override
	public List<Client> listClient() {
		@SuppressWarnings("unchecked")
		TypedQuery<Client>query=sessionFactory.getCurrentSession().createQuery("from Client");
		return query.getResultList();
	}

	@Override
	public void del(Client client) {
		sessionFactory.getCurrentSession().delete(client);
		
	}

	@Override
	public void update(Client client) {
		sessionFactory.getCurrentSession().update(client);
		
	}

	@Override
	public Client getClient(Client client) {
		List<Client> list=listClient();
		ListIterator<Client> lic=list.listIterator();
		while(lic.hasNext()) {
		Client findclient=lic.next();
		if(client.getNom().equals(findclient.getNom())&&client.getPrenom().equals(findclient.getPrenom()))
			return findclient;
		}
		return null;
	}

}
