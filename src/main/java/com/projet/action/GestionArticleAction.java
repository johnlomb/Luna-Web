package com.projet.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.projet.model.Article;
import com.projet.service.ArticleService;


@Namespace("/")
public class GestionArticleAction extends ActionSupport implements ModelDriven<Article> {
	
	Article article=new Article();
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ArticleService articleService;
	
	private List<Article> models=new ArrayList<Article>();
	
	@Override
	public Article getModel() {
		return article;
	}
	public List<Article> getModels() {
		return models;
	}
	
	public void setModels() {
		models=articleService.listArticle();
	}
	
	@Action(value = "addArticle", results =  @Result(name = "success", location = "/gestionarticle.jsp"))
	public String addArticle() {
		articleService.add(article);
		setModels();
		return SUCCESS;
	}
	
	@Action(value = "modifArticle", results =  @Result(name = "success", location = "/gestionarticle.jsp"))
	public String modifArticle() {
		Article base=articleService.getArticle(article);
		article.setIdarticle(base.getIdarticle());
		articleService.update(article);
		setModels();
		return SUCCESS;
	}
	
	@Action(value = "delArticle", results = @Result(name = "success", location = "/gestionarticle.jsp"))
	public String delArticle() {
		Article base=articleService.getArticle(article);
		article.setIdarticle(base.getIdarticle());
		articleService.del(article);
		setModels();
		return SUCCESS;
	}
	@Action(value = "gestionArticle", results = @Result(name = "success", location = "/gestionarticle.jsp"))
	public String execute(){
		setModels();
		return SUCCESS;
	}
}
