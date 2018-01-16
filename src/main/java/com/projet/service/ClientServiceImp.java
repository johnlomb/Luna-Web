package com.projet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.dao.ClientDao;
import com.projet.model.Client;

@Service
@Transactional
public class ClientServiceImp implements ClientService{
	
	@Autowired
	private ClientDao clientDao;
	@Override
	public void add(Client client) {
		clientDao.add(client);
		
	}

	@Override
	public List<Client> listClient() {
		return clientDao.listClient();
	}

	@Override
	public void del(Client client) {
		clientDao.del(client);
		
	}

	@Override
	public void update(Client client) {
		clientDao.update(client);
		
	}

}
