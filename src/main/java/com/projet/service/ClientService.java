package com.projet.service;

import java.util.List;

import com.projet.model.Client;

public interface ClientService {
	void add(Client client);

	List<Client> listClient();

	void del(Client client);

	void update(Client client);
	
	Client getClient(Client client);
}
