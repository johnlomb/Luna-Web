<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GestionClientAjouter -Luna</title>
<link rel="stylesheet" type="text/css" href="<s:url value='css/contentform.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/header.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/footer.css'> </s:url>">
</head>
<body>
	<header> <img id="gauche" src="img/logo-as.png" />
	<h1>Projet Luna Web</h1>
	<img id="droite" src="img/Moon-32.png" /> </header>
	<div id="content">
	<h1>Formulaire d'ajout de client</h1>
	<div id="form">
	<s:form action="addClient" method="POST">
		<s:textfield name="nom" id="nom" label="Nom"></s:textfield>
		<s:textfield name="prenom" id="prenom" label="Prénom"></s:textfield>
		<s:textfield name="adresse" id="adresse" label="Adresse"></s:textfield>
		<s:textfield type="number" name="codepostal" id="codepostal"
			label="Code Postal"></s:textfield>
		<s:textfield name="ville" id="ville" label="Ville"></s:textfield>
		<s:textfield name="telfixe" id="telfixe" label="Téléphone Fixe"></s:textfield>
		<s:textfield name="telmobile" id="telmobile" label="Téléphone mobile"></s:textfield>
		<s:textfield name="email" id="email" label="Email"></s:textfield>
		<s:checkbox name="cartefidelite" fieldValue="true"
			label="Carte de Fidélité" />

		<s:textfield name="remarques" id="remarques" label="Remarque"></s:textfield>
		<s:textfield name="datecreation" id="datecreation"
			label="Date de création"></s:textfield>

		<s:submit value="Valider"></s:submit>

	</s:form>
	</div>
	</div>
	<footer>
	<h1>
		Developpé par Jonathan Lombard sous l'expertise de l'entreprise
		O'dellya <img src="img/odellya.png">
	</h1>
	</footer>
</body>
</html>