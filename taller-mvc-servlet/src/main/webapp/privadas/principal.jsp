<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String nombreUsuario = (String) request.getAttribute("usuario");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Principal</title>
</head>
<body>
	<form action="/taller-mvc-servlet" method="get">
		<div aling="center">
			<font size="20">Bienvenido<%=nombreUsuario%></font>
		</div>
		<div aling="center">
			<input type="submit" value="Regresar">
		</div>
	</form>
	
	<hr>
</body>
</html>