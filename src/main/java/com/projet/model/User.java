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
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iduser;
	
	@Column(name = "PSEUDO")
	private String pseudo;
	
	@Column(name = "MOT DE PASSE")
	private String mdp;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int iduser, String pseudo, String mdp) {
		super();
		this.iduser = iduser;
		this.pseudo = pseudo;
		this.mdp = mdp;
	}


	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
}
