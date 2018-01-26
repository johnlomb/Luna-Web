package com.projet.service;

import java.util.List;

import com.projet.model.InnerCommande;

public interface InnerCommandeService {

	void add(InnerCommande innerCommande);
	List<InnerCommande> ListInCommande();
	void del(InnerCommande innerCommande);
	void update(InnerCommande innerCommande);
}
