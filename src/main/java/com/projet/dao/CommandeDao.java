package com.projet.dao;

import java.util.List;

import com.projet.model.Commande;

public interface CommandeDao {
	void add(Commande commande);
	List<Commande> listCommande();
	void del(Commande commande);
	void update(Commande commande);
}
