package com.projet.dao;

import java.util.List;

import com.projet.model.Article;

public interface ArticleDao {
	void add(Article article);
	List<Article> listArticle();
	void del(Article article);
	void update(Article article);
}
