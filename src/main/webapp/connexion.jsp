<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<s:url value='css/connexion.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/header.css'> </s:url>">
<link rel="stylesheet" type="text/css" href="<s:url value='css/footer.css'> </s:url>">
<title>Connexion - Luna</title>
</head>
<body>

<div id="degrade">
<img id="gauche" src="img/logo-as.png" />
<h2>Bienvenue sur Luna Projet</h2>
	<div id="form">
	<p>Connexion</p>
		<s:form action="addUser" validate="true">
			<s:textfield name="pseudo" id="pseudo" label="Nom"></s:textfield>
			<s:textfield name="mdp" id="mdp" label="Password"></s:textfield>
			<s:submit value="Valider"></s:submit>
		</s:form>
		<s:if test="hasActionErrors()">
			<div class="messerror">
				<s:actionerror />
			</div>
	</div>
	
		</s:if>
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