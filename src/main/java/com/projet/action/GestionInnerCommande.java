package com.projet.action;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.projet.model.Article;
import com.projet.model.Commande;
import com.projet.model.InnerCommande;
import com.projet.model.TempoTable;
import com.projet.service.ArticleService;
import com.projet.service.CommandeService;
import com.projet.service.InnerCommandeService;
import com.projet.service.TempoTableService;

public class GestionInnerCommande  extends ActionSupport{
	private static final long serialVersionUID = 1L;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CommandeService commandeService;
	@Autowired
	private TempoTableService tempoTableService;
	@Autowired
	private InnerCommandeService innerCommandeService;
	private String codearticle;
	private int quantite;
	private String client;
	private String date;
	private String modepaiement;
	
	
	@Action(value = "addArticleCommande", results = @Result(name = "success", location = "/gestioncommandeajouter.jsp"))
	public String addArticleINCommande() {
		Article article=articleService.getArticle(codearticle);
		double prix=article.getPrixunitaire()*quantite;
		TempoTable tt=new TempoTable(article.getDesignation(),quantite,prix,article.getCodearticle());
		tempoTableService.add(tt);
		return SUCCESS;
	}
	
	public double calculTTC() {
		ListIterator<TempoTable> li=tempoTableService.listTempo().listIterator();
		double ttc=0;
		while(li.hasNext()) {
			ttc=ttc+li.next().getPrix();
		}
		return ttc;
	}
	@Action(value = "addCommande", results = @Result(name = "success", location = "/gestioncommande.jsp"))
	public String addCommande() {
		Commande cd=new Commande(date, client, modepaiement, calculTTC());
		commandeService.add(cd);
		ListIterator<TempoTable> li=tempoTableService.listTempo().listIterator();
		while(li.hasNext()) {
			TempoTable tp=li.next();
			InnerCommande ic=new InnerCommande(cd.getIdcommande(),articleService.getArticle(tp.getCodearticle()).getIdarticle(),tp.getQuantite());
			innerCommandeService.add(ic);
		}
		tempoTableService.truncate();
		return SUCCESS;
	}
	
	public List<TempoTable> getModels() {
		return tempoTableService.listTempo();
	}

	public String getCodearticle() {
		return codearticle;
	}

	public void setCodearticle(String codearticle) {
		this.codearticle = codearticle;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getModepaiement() {
		return modepaiement;
	}

	public void setModepaiement(String modepaiement) {
		this.modepaiement = modepaiement;
	}

}
