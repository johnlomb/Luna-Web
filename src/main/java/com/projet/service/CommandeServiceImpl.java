package com.projet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.dao.CommandeDao;
import com.projet.model.Commande;

@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	private CommandeDao commandeDao;
	
	@Override
	public void add(Commande commande) {
		commandeDao.add(commande);
		
	}

	@Override
	public List<Commande> listCommande() {
		return commandeDao.listCommande();
		
	}

	@Override
	public void del(Commande commande) {
		commandeDao.del(commande);
		
	}

	@Override
	public void update(Commande commande) {
		commandeDao.update(commande);
		
	}
	public Commande getCommande(Commande commande) {
		return commandeDao.getCommande(commande);
	}

}
