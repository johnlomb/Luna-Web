package com.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Service
@Entity
@Table(name = "COMMANDES")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcommande;
	
	@Column(name = "DATE")
	private String date;
	
	@Column(name = "CLIENT")
	private String client;
	
	@Column(name = "MODE_DE_PAIEMENT")
	private String modepaiement;
	
	@Column(name = "TOTAL_TTC")
	private double totalTTC;
	
	// Constructeur par défaut
	public Commande() {
	}
	
	// Constructeur 2
	public Commande(String date, String client, String modepaiement, double totalTTC) {
		super();
		this.date = date;
		this.client = client;
		this.modepaiement = modepaiement;
		this.totalTTC = totalTTC;
	}

	
	public int getIdcommande() {
		return idcommande;
	}

	public void setIdcommande(int idcommande) {
		this.idcommande = idcommande;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getModepaiement() {
		return modepaiement;
	}

	public void setModepaiement(String modepaiement) {
		this.modepaiement = modepaiement;
	}

	public double getTotalTTC() {
		return totalTTC;
	}

	public void setTotalTTC(double totalTTC) {
		this.totalTTC = totalTTC;
	}

	@Override
	public String toString() {
		return "Commande [idcommande=" + idcommande + ", date=" + date + ", client=" + client + ", modepaiement="
				+ modepaiement + ", totalTTC=" + totalTTC + "]";
	}

	
}
