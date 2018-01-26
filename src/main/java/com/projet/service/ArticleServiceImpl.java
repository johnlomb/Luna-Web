package com.projet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.dao.ArticleDao;
import com.projet.model.Article;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public void add(Article article) {
		articleDao.add(article);
		
	}

	@Override
	public List<Article> listArticle() {
		return articleDao.listArticle();
	}

	@Override
	public void del(Article article) {
		articleDao.del(article);
		
	}

	@Override
	public void update(Article article) {
		articleDao.update(article);
		
	}
	public Article getArticle(Article article) {
		return articleDao.getArticle(article);
	}

	@Override
	public Article getArticle(String codearticle) {
		return articleDao.getArticle(codearticle);
	}

}
