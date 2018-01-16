package com.projet.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.projet.context.ioc.ConteneurSpring;
import com.projet.model.Client;
import com.projet.model.User;
import com.projet.service.ClientService;
import com.projet.service.UserService;

public class TestDao {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ConteneurSpring.class);
		ClientService clientService=ctx.getBean(ClientService.class);
//		User toto1=new User("prezrz","rtetfgsfe");
//		userService.add(toto1);
//		User toto=new User("ptr","rtete");
//		userService.add(toto);
//		User totos=userService.getUser(toto.getPseudo(), toto.getMdp());
//		userService.del(totos);
//		toto1.setMdp("f14");
//		userService.update(toto1);
//		Client c1=new Client("er", "er", true, "re", "er", "er", "telmobile", "er", "er", 14, "er");
//		clientService.add(c1);
//		c1.setAdresse("coca");
//		clientService.update(c1);
//		clientService.del(c1);
		List<Client> lc=clientService.listClient();
		System.out.println(lc.toString());
		
		
	}
}
