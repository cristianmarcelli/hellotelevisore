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

	<% Televisore televisoreDaModificare = (Televisore) request.getAttribute("televisoreDaInviareAPaginaEdit"); %>
	
		<h3>Inserisci le specifiche da modificare</h3>
		<form action="ExecuteInsertTelevisoreServlet" method="post">
			<input type="hidden" name="idTelevisore" value="<%=televisoreDaModificare.getIdTelevisore()%>">
			<label for="marcaInputId">MARCA:</label><br>
			<input type="text" name="marcaInput" id="marcaInputId">
			<br>
			<label for="modelloInputId">MODELLO:</label><br>
			<input type="text" name="modelloInput" id="modelloInputId">
			<br>
			<label for="prezzoInputId">PREZZO:</label><br>
			<input type="text" name="prezzoInput" id="prezzoInputId">
			<br>
			<label for="numeroPolliciInputId">NUMERO POLLICI:</label><br>
			<input type="text" name="numeroPolliciInput" id="numeroPolliciInputId">
			<br>
			<label for="codiceInputId">CODICE:</label><br>
			<input type="text" name="codiceInput" id="codiceInputId">
			<br>
			<br>
			<input type="submit" value="Conferma">
		</form>
	
	<br><a href="searchForm.jsp">Torna alla home</a>

</body>
</html>