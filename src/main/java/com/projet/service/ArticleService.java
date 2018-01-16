package com.projet.service;

import java.util.List;

import com.projet.model.Article;

public interface ArticleService {
	void add(Article article);
	List<Article> listArticle();
	void del(Article article);
	void update(Article article);
}
