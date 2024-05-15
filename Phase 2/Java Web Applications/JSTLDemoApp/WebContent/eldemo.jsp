<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int a,b,sum; %>
<%
a=10;
b=20;
sum = a+b;
out.println("Sum of two number is "+sum);
%>
<br/>
<p>Sum of two numbers is <%=sum %></p>
<p>Sum of two numbers is <%=10+20 %><p>
<p>Sum of two numbers is ${100+200} </p>
<p>Difference of two numbers is ${100-200} </p>
<p>Multiplication of two numbers is ${100*200} </p>
<p>Div of two numbers is ${100/200} </p>
<p>Greater than for two number is ${100 > 200} </p>
<p>Less than for two numbers is ${100 < 200} </p>
<p>Equal of two numbesr is ${100 == 200} </p>
<p>Not equal of two numbers is ${100!=200} </p>
<p>Div of two numbers is ${100 div 200} </p>


</body>
</html>