package com.projet.dao;

import java.util.List;
import java.util.ListIterator;


import javax.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.model.Article;

@Repository
public class ArticleDaoImp implements ArticleDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void add(Article article) {
		sessionFactory.getCurrentSession().save(article);

	}

	public List<Article> listArticle() {
		@SuppressWarnings("unchecked")
		TypedQuery<Article> query = sessionFactory.getCurrentSession().createQuery("from Article");
		return query.getResultList();
	}

	public void del(Article article) {
		sessionFactory.getCurrentSession().delete(article);

	}

	public void update(Article article) {
		sessionFactory.getCurrentSession().update(article);

	}

	public Article getArticle(Article article) {
		List<Article> list = listArticle();
		ListIterator<Article> lia = list.listIterator();
		while (lia.hasNext()) {
			Article findarticle = lia.next();
			if (article.getCodearticle().equals(findarticle.getCodearticle())) {
				return findarticle;
			}
		}
		return null;
	}

	@Override
	public Article getArticle(String codearticle) {
		List<Article> list = listArticle();
		ListIterator<Article> lia = list.listIterator();
		while (lia.hasNext()) {
			Article findarticle = lia.next();
			if (codearticle.equals(findarticle.getCodearticle())) {
				return findarticle;
			}
		}
		return null;
	}

}
