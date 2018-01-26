package com.projet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Service
@Entity
@Table
public class TempoTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designation;
	private int quantite;
	private double prix;
	private String codearticle;
	
	public TempoTable() {
		
	}
	
	public TempoTable(String designation,int quantite,double prix,String codearticle) {
		this.designation=designation;
		this.prix=prix;
		this.quantite=quantite;
		this.codearticle=codearticle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getCodearticle() {
		return codearticle;
	}

	public void setCodearticle(String codearticle) {
		this.codearticle = codearticle;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	@Override
	public String toString() {
		return "TempoTable [id=" + id + ", designation=" + designation + ", quantite=" + quantite + ", prix=" + prix
				+ ", codearticle=" + codearticle + "]";
	}
	
}
