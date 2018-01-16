package com.projet.model;
/*
 * @param idarticle
 * 		L'identifiant de l'article
 * @param codecategorie
 * 		Le code cat�gorie
 * @param designation
 * 		La d�signation de l'article
 * @param quantite
 * 		Le nombre d'articles d�clar�s dans la commande
 * @param prixunitaire
 * 		Le prix unitaire de l'article
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Service
@Entity
@Table(name = "ARTICLE")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idarticle;
	
	@Column(name = "CODE CATEGORIE")
	private String codecategorie;
	
	@Column(name = "DESIGNATION")
	private String designation;
	
	@Column(name = "PRIX UNITAIRE")
	private double prixunitaire;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}

	public Article(String codecategorie, String designation, double prixunitaire) {
		super();
		this.codecategorie = codecategorie;
		this.designation = designation;
		this.prixunitaire = prixunitaire;
	}



	public int getIdarticle() {
		return idarticle;
	}

	public String getCodecategorie() {
		return codecategorie;
	}

	public void setCodecategorie(String codecategorie) {
		this.codecategorie = codecategorie;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrixunitaire() {
		return prixunitaire;
	}

	public void setPrixunitaire(double prixunitaire) {
		this.prixunitaire = prixunitaire;
	}

	
}
