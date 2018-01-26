package com.projet.service;

import java.util.List;

import com.projet.model.Article;

public interface ArticleService {
	void add(Article article);
	List<Article> listArticle();
	void del(Article article);
	void update(Article article);
	public Article getArticle(Article article);
	public Article getArticle(String codearticle);
}
