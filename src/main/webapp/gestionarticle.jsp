<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<s:url value='css/header.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/footer.css'> </s:url>">
<title>GestionArticle - Luna</title>
</head>
<body>
<header> <img id="gauche" src="img/logo-as.png" />
	<h1>Projet Luna Web</h1>
	<img id="droite" src="img/Moon-32.png" /> </header>
	<table>
		<tr>
			<td>Code</td>
			<td>Catégorie</td>
			<td>Désignation</td>
			<td>Prix Unitaire</td>
		</tr>
		<s:iterator value="getModels()" status="modelsStatus">
			<tr>
				<td><s:property value="codearticle" /></td>
				<td><s:property value="codecategorie" /></td>
				<td><s:property value="designation" /></td>
				<td><s:property value="prixunitaire" /></td>
			</tr>
		</s:iterator>
	</table>
	<a href="gestionarticleajoute.jsp"><button>Ajouter un article</button></a>
	<a href="gestionarticlemodifier.jsp"><button>Modifier un article</button></a>
	<a href="gestionarticlesupprimer.jsp"><button>Supprimer un article</button></a>
	<a href="menu.jsp"><button>retour au Menu</button></a>
	<footer>
	<h1>
		Developpé par Jonathan Lombard sous l'expertise de l'entreprise
		O'dellya <img src="img/odellya.png">
	</h1>
	</footer>
</body>
</html>