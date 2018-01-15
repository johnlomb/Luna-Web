package com.projet.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.projet.model.Article;
import com.projet.model.Client;

public class ArticleDaoImp implements ArticleDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(Article article) {
		sessionFactory.getCurrentSession().save(client);

	}

	@Override
	public List<Article> listArticle() {
		@SuppressWarnings("unchecked")
		TypedQuery<Article>query=sessionFactory.getCurrentSession().createQuery("from ARTICLE");
		return query.getResultList();
	}

	@Override
	public void del(Article article) {
		sessionFactory.getCurrentSession().delete(article);

	}

	@Override
	public void update(Article article) {
		sessionFactory.getCurrentSession().update(article);

	}

}
