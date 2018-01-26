package com.projet.dao;

import java.util.List;

import com.projet.model.InnerCommande;;

public interface InnerCommandeDao {
	void add(InnerCommande innerCommande);
	List<InnerCommande> ListInCommande();
	void del(InnerCommande innerCommande);
	void update(InnerCommande innerCommande);
}
