<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div aling="center">
		<h1>Login Aplicacion Taller</h1>
		<hr>
	</div>
	<div aling="center">
		<form action="/taller-mvc-servlet/login.do" method="post">
			<table id="login">
				<tbody>
					<tr>
						<td>Usuario:</td>
						<td><input id="usuario" type="text" name="usuario"></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" name="clave" id="clave"></td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<th><input type="submit" value="Login"></th>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
	
	
</body>
</html>