package com.projet.dao;

import java.util.List;

import com.projet.model.Commande;

public interface CommandeDao {
	void add(Commande article);
	List<Commande> listArticle();
	void del(Commande article);
	void update(Commande article);
}
