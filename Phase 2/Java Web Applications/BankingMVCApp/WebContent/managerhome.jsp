<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Customer Home Page ${sessionScope.name}</h2>
<%
Object obj = session.getAttribute("name");
String name = (String)obj;
out.println("Welcome manager "+name);
%>
</body>
</html>