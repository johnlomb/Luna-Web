package com.projet.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.projet.model.Commande;
import com.projet.service.CommandeService;

public class GestionCommandeAction extends ActionSupport implements ModelDriven<Commande> {

	Commande commande = new Commande();
	private static final long serialVersionUID = 1L;

	@Autowired
	private CommandeService commandeService;

	private List<Commande> models = new ArrayList<Commande>();

	@Override
	public Commande getModel() {

		return commande;
	}

	private void setModels() {
		models = commandeService.listCommande();

	}

	public List<Commande> getModels() {
		return models;
	}

	@Action(value = "delCommande", results = @Result(name = "success", location = "/gestioncommande.jsp"))
	public String delCommande() {
		 Commande base=commandeService.getCommande(commande);
		 commande.setIdcommande(base.getIdcommande());
		 commandeService.del(commande);
		 setModels();
		return SUCCESS;
	}

	@Action(value = "gestionCommande", results = @Result(name = "success", location = "/gestioncommande.jsp"))
	public String execute() {
		setModels();
		return SUCCESS;
	}

}
