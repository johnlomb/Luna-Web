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
<table>
		<tr>
			<td>Numero de commande</td>
			<td>Nom du client </td>
			<td>date de la commande</td>
			<td>mode de paiement</td>
			<td>prix total de la commande</td>
		</tr>
		<s:iterator value="getModels()" status="modelsStatus">
			<tr>
				<td><s:property value="idcommande" /></td>
				<td><s:property value="client" /></td>
				<td><s:property value="date" /></td>
				<td><s:property value="modepaiement" /></td>
				<td><s:property value="totalTTC" /></td>
			</tr>
		</s:iterator>
	</table>
	<a href="gestioncommandeajouter.jsp"><button>Ajouter une commande</button></a>
	<a href="gestioncommandesupprimer.jsp"><button>Supprimer une commande</button></a>
	<a href="menu.jsp"><button>retour au Menu</button></a>
	<footer>
	<h1>
		Developpé par Jonathan Lombard sous l'expertise de l'entreprise
		O'dellya <img src="img/odellya.png">
	</h1>
	</footer>
</body>
</html>