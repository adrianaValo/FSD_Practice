<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>WElcome to HTML Page</h2>
<%!int a,b,sum; %>
<%
System.out.println("Welcome to JSP Page on server console");
out.print("Welcome to JSP On Browser");
//int a=10;
//int b=20;
//int sum = a+b;
a=1;
b=2;
sum = a+b;
out.print("<br/><font color='red'>sum of two number is "+sum+"</font>");
if(a>b){
	out.println("<br/> a is largest");
}else {
	out.println("<br/> b is largest");
}
%>
<br/>
<p>Sum of two number using expression tag is <%=100+200 %></p>
<p>Sum of <%=a %> and <%=b %> is <%=sum %></p>
<p><font color="green">Sum of <%=a %> and <%=b %> is <%=sum %></font></p>
</body>


</html>