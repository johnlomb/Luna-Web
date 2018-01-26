package com.projet.service;

import java.util.List;

import com.projet.model.TempoTable;

public interface TempoTableService {
	void add(TempoTable tempoTable);
	List<TempoTable> listTempo();
	void del(TempoTable tempoTable);
	void update(TempoTable tempoTable);
	void truncate();
}
