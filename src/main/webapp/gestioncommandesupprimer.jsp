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
<s:form action="delCommande" method="POST">
		<s:textfield name="idcommande" id="idcommande" label="numero de commande"></s:textfield>
		<s:hidden name="client"/>
		<s:hidden name="date"/>
		<s:hidden name="modepaiement"/>
		<s:hidden type="number" name="totalTTC"/>
		<s:submit value="Valider"></s:submit>

	</s:form>
	<footer>
	<h1>
		Developp� par Jonathan Lombard sous l'expertise de l'entreprise
		O'dellya <img src="img/odellya.png">
	</h1>
	</footer>
</body>
</html>