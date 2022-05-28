<%@page import="it.prova.hellotelevisore.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Televisore televisoreDaEliminare = (Televisore) request.getAttribute("identificativoTelevisoreDaEliminare_attribute"); %>
	
		<p>Marca: <%=televisoreDaEliminare.getMarca() %></p>
		<p>Modello: <%=televisoreDaEliminare.getModello() %></p>
		<p>Prezzo: <%=televisoreDaEliminare.getPrezzo() %></p>
		<p>Numero pollici: <%=televisoreDaEliminare.getNumeroPollici() %></p>
		<p>Codice: <%=televisoreDaEliminare.getCodice() %></p>
		
		<form action="ExecuteDeleteTelevisoreServlet" method="post">
			<input type="submit" value="Conferma">
			<input type="hidden" name="idTelevisore" value="<%= televisoreDaEliminare.getIdTelevisore()%>">
		</form><br>
		
		<a href="searchForm.jsp">Torna alla home</a>

</body>
</html>