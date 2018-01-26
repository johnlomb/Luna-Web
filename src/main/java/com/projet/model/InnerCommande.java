package com.projet.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.sql.ordering.antlr.FormulaReference;
import org.springframework.stereotype.Service;

@Service
@Entity
@Table(name = "INNERCOMMANDE")
public class InnerCommande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_command;
	private int id_article;
	private int quantite;

	public InnerCommande() {
		super();
	}

	public InnerCommande(int id_commande, int id_article, int quantite) {
		super();
		this.id_command = id_commande;
		this.id_article = id_article;
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_command() {
		return id_command;
	}

	public void setId_command(int id_command) {
		this.id_command = id_command;
	}

	public int getId_article() {
		return id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}

	@Override
	public String toString() {
		return "InnerCommande [id=" + id + ", id_command=" + id_command + ", id_article=" + id_article + ", quantite="
				+ quantite + "]";
	}



	
}
