package com.projet.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.projet.context.ioc.ConteneurSpring;
import com.projet.model.*;
import com.projet.service.*;


public class TestDao {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ConteneurSpring.class);
		InnerCommandeService ics=ctx.getBean(InnerCommandeService.class);
		ClientService clientService=ctx.getBean(ClientService.class);
		ArticleService articleService=ctx.getBean(ArticleService.class);
		CommandeService commandeService=ctx.getBean(CommandeService.class);
		TempoTableService tempoTableService=ctx.getBean(TempoTableService.class);
//		User toto1=new User("prezrz","rtetfgsfe");
//		userService.add(toto1);
//		User toto=new User("ptr","rtete");
//		userService.add(toto);
//		User totos=userService.getUser(toto.getPseudo(), toto.getMdp());
//		userService.del(totos);
//		toto1.setMdp("f14");
//		userService.update(toto1);
//		Client c1=new Client("Raflesia", "Tania", true, "23/01/2018", "rue des Brouillons", "0321345678", "0621345678", "email1@messagerie.com", "il est VIP", 59862, "Lille");
//		clientService.add(c1);
//		c1.setAdresse("coca");
//		clientService.update(c1);
//		clientService.del(c1);
//		List<Client> lc=clientService.listClient();
//		System.out.println(lc);
		Commande commande=new Commande("today", "tomas", "cb", 24);
//		Article art=new Article("nourriture", "cacahuete", 12);
		commandeService.add(commande);
		System.out.println(commande.getIdcommande());
//		articleService.add(art);
//		//System.out.println("taille des articles" +articleService.listArticle().size());
//		List<Article> t=articleService.listArticle();
//		System.out.println(t.get(0));
//		articleService.del(t.get(0));
//		System.out.println(commandeService.listCommande().size());
//		Article art=articleService.getArticle("nour1");
//		System.out.println(art);
		
//		TempoTable tt=new TempoTable("toto", 4, 46.5, "jouehy");
//		System.out.println(tt);
//		tempoTableService.add(tt);
		InnerCommande ic=new InnerCommande(1, 1, 45);
		ics.add(ic);
	}
}
