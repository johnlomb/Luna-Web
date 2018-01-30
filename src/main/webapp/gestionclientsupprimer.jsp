<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GestionClientSupprimer - Luna</title>
<link rel="stylesheet" type="text/css" href="<s:url value='css/header.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/footer.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/gestionclientsupprimer.css'> </s:url>">
</head>
<body>
<header> <img id="gauche" src="img/logo-as.png" />
	<h1>Projet Luna Web</h1>
	<img id="droite" src="img/Moon-32.png" /> </header>
	<div id="content">
	<h1>Formulaire de suppression de client</h1>
	<div id="form">
<s:form action="delClient" method="POST">
		<s:textfield name="nom" id="nom" label="Nom"></s:textfield>
		<s:textfield name="prenom" id="prenom" label="Prénom"></s:textfield>
		<s:hidden name="adresse"/>
		<s:hidden name="codepostal"/>
		<s:hidden name="ville"/>
		<s:hidden name="telfixe"/>
		<s:hidden name="telmobile"/>
		<s:hidden name="email"/>
		<s:hidden name="cartefidelite"/>
		<s:hidden name="remarques"/>
		<s:hidden name="datecreation"/>
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