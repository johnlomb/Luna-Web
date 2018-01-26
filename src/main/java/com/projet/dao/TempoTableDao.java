package com.projet.dao;

import java.util.List;

import com.projet.model.TempoTable;

public interface TempoTableDao {
	void add(TempoTable tempoTable);
	List<TempoTable> listTempo();
	void del(TempoTable tempoTable);
	void update(TempoTable tempoTable);
	void truncate();
}
