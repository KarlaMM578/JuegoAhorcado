<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Letra</title>
</head>
<body>
	<%
	out.print(request.getAttribute("saludo"));
		out.print(request.getAttribute("letra"));
	%>
</body>
</html>