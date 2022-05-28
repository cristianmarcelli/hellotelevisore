<%@page import="it.prova.hellotelevisore.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio</title>
</head>
<body>

	<% Televisore televisoreInstance = (Televisore)request.getAttribute("televisoreDaInviareAPaginaDettaglio"); %>

	<p>MARCA: <%=televisoreInstance.getMarca() %></p>
	<p>MODELLO: <%=televisoreInstance.getModello() %></p>
	<p>PREZZO: <%=televisoreInstance.getPrezzo() %></p>
	<p>NUMERO POLLICI: <%=televisoreInstance.getNumeroPollici() %></p>
	<p>CODICE: <%=televisoreInstance.getCodice() %></p>
	
	<a href="searchForm.jsp">Torna alla home</a>

</body>
</html>