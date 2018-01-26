package com.projet.dao;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.model.TempoTable;
@Repository
public class TempoTableImp implements TempoTableDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(TempoTable tempoTable) {
		sessionFactory.getCurrentSession().save(tempoTable);
		
	}

	@Override
	public List<TempoTable> listTempo() {
		TypedQuery<TempoTable> query = sessionFactory.getCurrentSession().createQuery("from TempoTable");
		return query.getResultList();
	}

	@Override
	public void del(TempoTable tempoTable) {
		sessionFactory.getCurrentSession().delete(tempoTable);
		
	}

	@Override
	public void update(TempoTable tempoTable) {
		sessionFactory.getCurrentSession().update(tempoTable);
		
	}

	@Override
	public void truncate() {
		List<TempoTable> listsupr=listTempo();
		ListIterator<TempoTable> li=listsupr.listIterator();
		while(li.hasNext()) {
			del(li.next());
		}
		
	}
	
}
