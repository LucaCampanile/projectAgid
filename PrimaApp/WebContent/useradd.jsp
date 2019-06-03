<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prima applicazione=Nuovo user</title>
</head>
<body>
<h1>Creazione Nuovo USER</h1>
<p>
firstname: <% String fName = request.getParameter("firstname"); out.print(fName); %>
</p>
lastname: <% String lName = request.getParameter("lastname"); out.print(lName); %>
</p>
country: <% String sName = request.getParameter("country"); out.print(sName); %>
</p>
</body>
</html>