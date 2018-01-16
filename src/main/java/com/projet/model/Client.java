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
@Table(name = "CLIENT")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclient;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "PRENOM")
	private String prenom;
	
	@Column(name = "CARTE_FIDELITE")
	private boolean cartefidelite;
	
	@Column(name = "DATE_DE_CREATION")
	private String datecreation;
	
	@Column(name = "ADRESSE")
	private String adresse;
	
	@Column(name = "TELEPHONE_FIXE")
	private String telfixe;
	
	@Column(name = "TELEPHONE_MOBILE")
	private String telmobile;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "REMARQUES")
	private String remarques;
	
	@Column(name = "CODE_POSTAL")
	private int codepostal;
	
	@Column(name = "VILLE")
	private String ville;

	public Client() {
	}

	public Client(String nom, String prenom, boolean cartefidelite, String datecreation, String adresse, String telfixe,
			String telmobile, String email, String remarques, int codepostal, String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cartefidelite = cartefidelite;
		this.datecreation = datecreation;
		this.adresse = adresse;
		this.telfixe = telfixe;
		this.telmobile = telmobile;
		this.email = email;
		this.remarques = remarques;
		this.codepostal = codepostal;
		this.ville = ville;
	}

	public int getIdclient() {
		return idclient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isCartefidelite() {
		return cartefidelite;
	}

	public void setCartefidelite(boolean cartefidelite) {
		this.cartefidelite = cartefidelite;
	}

	public String getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(String datecreation) {
		this.datecreation = datecreation;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelfixe() {
		return telfixe;
	}

	public void setTelfixe(String telfixe) {
		this.telfixe = telfixe;
	}

	public String getTelmobile() {
		return telmobile;
	}

	public void setTelmobile(String telmobile) {
		this.telmobile = telmobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	public int getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}
