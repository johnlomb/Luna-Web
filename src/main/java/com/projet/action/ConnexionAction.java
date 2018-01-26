package com.projet.action;

import com.projet.model.User;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.projet.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Namespace("/")
@Action(value = "addUser", results ={  @Result(name = "success", location = "/menu.jsp"),@Result(name = "error", location = "/connexion.jsp") })
public class ConnexionAction extends ActionSupport implements ModelDriven<User> {
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserService userService;
	
	User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	
	public String execute() {
		if(userService.checkUser(user)) {
		return SUCCESS;
		}
		else {
			addActionError("vos indentifiant sont incorrect veuillez réessayer");
			return ERROR;
		}
	}

}
