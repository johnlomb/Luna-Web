package com.projet.dao;

import java.util.List;

import com.projet.model.Client;

public interface ClientDao {
	void add(Client client);
	List<Client> listClient();
	void del(Client client);
	void update(Client client);
	Client getClient(Client client);
}
