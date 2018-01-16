package com.projet.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.model.Article;

@Repository
public class ArticleDaoImp implements ArticleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void add(Article article) {
		sessionFactory.getCurrentSession().save(article);

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
