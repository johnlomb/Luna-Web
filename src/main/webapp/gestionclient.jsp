<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<s:url value='css/gestionclient.css'> </s:url>">
<link rel="stylesheet" type="text/css"
	href="<s:url value='css/header.css'> </s:url>">
<link rel="stylesheet" type="text/css"
	href="<s:url value='css/footer.css'> </s:url>">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GestionClient -Luna</title>
</head>
<body>
	<header> <img id="gauche" src="img/logo-as.png" />
	<h1>Projet Luna Web</h1>
	<img id="droite" src="img/Moon-32.png" /> </header>
	<div id="content">
	<h1>Gestion des Clients</h1>
		<table>
			<tr>
				<td class="presentation">Nom</td>
				<td class="presentation">Prénom</td>
				<td class="presentation">Adresse</td>
				<td class="presentation">Code Postal</td>
				<td class="presentation">Ville</td>
				<td class="presentation">Téléphone fixe</td>
				<td class="presentation">Téléphone mobile</td>
				<td class="presentation">Email</td>
				<td class="presentation">Carte Fidelité</td>
				<td class="presentation">Remarque</td>
				<td class="presentation">Date Création</td>
			</tr>
			<s:iterator value="getModels()" status="modelsStatus">
				<tr>
					<td><s:property value="nom" /></td>
					<td><s:property value="prenom" /></td>
					<td><s:property value="adresse" /></td>
					<td><s:property value="codepostal" /></td>
					<td><s:property value="ville" /></td>
					<td><s:property value="telfixe" /></td>
					<td><s:property value="telmobile" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="cartefidelite" /></td>
					<td><s:property value="remarques" /></td>
					<td><s:property value="datecreation" /></td>
				</tr>
			</s:iterator>
		</table>
		<a href="gestionclientajouter.jsp"><button>Ajouter un
				client</button></a> <a href="gestionclientmodifier.jsp"><button>Modifier
				un client</button></a> <a href="gestionclientsupprimer.jsp"><button>Supprimer
				un client</button></a> <a href="menu.jsp"><button>retour au Menu</button></a>
	</div>
	<footer>
	<h1>
		Developpé par Jonathan Lombard sous l'expertise de l'entreprise
		O'dellya <img src="img/odellya.png">
	</h1>
	</footer>
</body>
</html>