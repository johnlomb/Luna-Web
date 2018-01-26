<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<s:url value='css/header.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/footer.css'> </s:url>">
</head>
<body>
<header> <img id="gauche" src="img/logo-as.png" />
	<h1>Projet Luna Web</h1>
	<img id="droite" src="img/Moon-32.png" /> </header>
<s:form action="addArticleCommande" method="POST">
		<s:textfield name="codearticle" id="codearticle" label="Code de l'article"></s:textfield>
		<s:textfield type="number" name="quantite" id="quantite" label="nombre d'article"></s:textfield>
		<s:submit value="Valider"></s:submit>
		</s:form>
		
		<table>
		<tr>
			<td>Designation </td>
			<td>quantité</td>
			<td>prix</td>
		</tr>
		<s:iterator value="getModels()" status="modelsStatus">
			<tr>
				<td><s:property value="designation" /></td>
				<td><s:property value="quantite" /></td>
				<td><s:property value="prix" /></td>
			</tr>
		</s:iterator>
		<s:form action="addCommande" method="POST">
		<s:textfield name="client" id="client" label="Nom"></s:textfield>
		<s:textfield name="date" id="date" label="Date"></s:textfield>
		<s:textfield name="modepaiement" id="modepaiement" label="Mode de paiement"></s:textfield>
		
		<s:submit value="Valider"></s:submit>
		</s:form>
	</table>
	<footer>
	<h1>
		Developpé par Jonathan Lombard sous l'expertise de l'entreprise
		O'dellya <img src="img/odellya.png">
	</h1>
	</footer>
</body>
</html>