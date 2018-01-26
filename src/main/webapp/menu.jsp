<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<s:url value='css/menu.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/header.css'> </s:url>">
<link rel="stylesheet" type="text/css"href="<s:url value='css/footer.css'> </s:url>">
<title>Menu - Luna</title>
</head>
<body>
	<header> <img id="gauche" src="img/logo-as.png" />
	<h1>Projet Luna Web</h1>
	<img id="droite" src="img/Moon-32.png" /> </header>
	<div id="content">
	<s:a action="gestionClient">
		<button id="gescli">gestion client</button>
	</s:a>
	<s:a action="gestionCommande">
		<button id="gescom">gestion commande</button>
	</s:a>
	<s:a action="gestionArticle">
		<button id="gesart">gestion article</button>
	</s:a>
	</div>
	<footer>
	<h1>Developpé par Jonathan	Lombard sous l'expertise de l'entreprise O'dellya
	<img src="img/odellya.png"></h1>
	</footer>
</body>
</html>