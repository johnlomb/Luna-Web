package com.projet.action;

import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.projet.model.Client;
import com.projet.service.ClientService;


public class GestionClientAction extends ActionSupport implements ModelDriven<Client> {
	
	Client client=new Client();
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ClientService clientService;
	
	private List<Client> models=new ArrayList<Client>();
	
	@Override
	public Client getModel() {
		
		return client;
	}
	public List<Client> getModels() {
		return models;
	}
	
	public void setModels() {
		models=clientService.listClient();
	}
	
	@Action(value = "addClient", results =  @Result(name = "success", location = "/gestionclient.jsp"))
	public String addClient() {
		clientService.add(client);
		setModels();
		return SUCCESS;
	}
	
	@Action(value = "modifClient", results =  @Result(name = "success", location = "/gestionclient.jsp"))
	public String modifClient() {
		Client base=clientService.getClient(client);
		client.setIdclient(base.getIdclient());
		clientService.update(client);
		setModels();
		return SUCCESS;
	}
	
	@Action(value = "delClient", results = @Result(name = "success", location = "/gestionclient.jsp"))
	public String delClient() {
		Client base=clientService.getClient(client);
		client.setIdclient(base.getIdclient());
		clientService.del(client);
		setModels();
		return SUCCESS;
	}
	@Action(value = "gestionClient", results = @Result(name = "success", location = "/gestionclient.jsp"))
	public String execute(){
		setModels();
		return SUCCESS;
	}

}
