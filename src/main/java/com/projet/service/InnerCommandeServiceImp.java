package com.projet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.dao.InnerCommandeDao;
import com.projet.model.InnerCommande;

@Service
@Transactional
public class InnerCommandeServiceImp implements InnerCommandeService {

	@Autowired
	private InnerCommandeDao innerCommandeDao;
	@Override
	public void add(InnerCommande innerCommande) {
		innerCommandeDao.add(innerCommande);

	}

	@Override
	public List<InnerCommande> ListInCommande() {
		return innerCommandeDao.ListInCommande();
	}

	@Override
	public void del(InnerCommande innerCommande) {
		innerCommandeDao.del(innerCommande);

	}

	@Override
	public void update(InnerCommande innerCommande) {
		innerCommandeDao.update(innerCommande);

	}

}
