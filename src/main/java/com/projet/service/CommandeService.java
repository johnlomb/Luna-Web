package com.projet.service;

import java.util.List;

import com.projet.model.Commande;

public interface CommandeService {
	void add(Commande commande);
	List<Commande> listCommande();
	void del(Commande commande);
	void update(Commande commande);
	Commande getCommande(Commande commande);
}
