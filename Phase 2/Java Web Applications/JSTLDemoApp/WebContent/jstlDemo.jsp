<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to HTML Code</h2>
<%
int a=10;
int m=100;
int n=50;
	String names[] = {"Steven","Lex","John","Neema","Raj"};
	request.setAttribute("names", names);
out.println("Welcome to JSP Page using scriptlet tag, Value of a "+a);
if(m>n){
	out.println("<br/>m is largest");
}else {
	out.println("<br/>n is largest");
}
%>
<br/>
<core:out value="Welcome to JSTL"></core:out>
<br/>
<core:set var="b" value="20"></core:set>
<p>Value of b is <core:out value="${b}"></core:out></p>
<br/>
<core:set var="m1" value="1000"></core:set>
<core:set var="n1" value="5000"></core:set>
<p>if condition using jstl </p>
<core:if test="${Integer.parseInt(m1) > Integer.parseInt(n1)}">
	<core:out value="m is largest"></core:out>
</core:if>
<core:if test="${ Integer.parseInt(m1) < Integer.parseInt(n1) }">
	<core:out value="n is largest"></core:out>
</core:if>
<h2>All names retrieve using scriptlet tag </h2>
<%
Object obj = request.getAttribute("names");
String stdnames[]=(String[])obj;
out.println("<ol>");
for(String name:stdnames){
	out.println("<li>"+name+"</li>");
}
out.println("</ol>");
%>
<h2>All names retrieve using jstl </h2>
<ol>
<core:forEach var="name" items="${requestScope.names}">
	<li><core:out value="${name}"></core:out></li>
</core:forEach>
</ol>
</body>
</html>