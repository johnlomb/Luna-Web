package com.projet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.dao.TempoTableDao;
import com.projet.model.TempoTable;
@Service
@Transactional
public class TempoTableServiceImp implements TempoTableService {

	@Autowired
	private TempoTableDao tempoTableDao;
	@Override
	public void add(TempoTable tempoTable) {
		tempoTableDao.add(tempoTable);

	}

	@Override
	public List<TempoTable> listTempo() {
		
		return tempoTableDao.listTempo();
	}

	@Override
	public void del(TempoTable tempoTable) {
		tempoTableDao.del(tempoTable);

	}

	@Override
	public void update(TempoTable tempoTable) {
		tempoTableDao.update(tempoTable);

	}

	@Override
	public void truncate() {
		tempoTableDao.truncate();

	}

}
