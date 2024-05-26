<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Batch Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Add Batch Details</h2>
    <form action="BatchController" method="post" class="p-4 border rounded bg-light">
        <div class="mb-3">
            <label for="typeofbatch" class="form-label">Type of Batch</label>
            <select name="typeofbatch" id="typeofbatch" class="form-select">
                <option value="">--Select Batch--</option>
                <option value="Morning">Morning</option>
                <option value="Evening">Evening</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="time" class="form-label">Time</label>
            <select name="time" id="time" class="form-select">
                <option value="">--Time--</option>
                <%
                for(int i=1, j=2; i<=12 && j<13; i++, j++){
                %>
                <option value="<%=i%>-<%=j%>"><%=i%>-<%=j%></option>
                <%
                }
                %>
            </select>
        </div>
        <div class="mb-3">
            <input type="submit" value="Add Batch" class="btn btn-primary">
            <input type="reset" value="Reset" class="btn btn-secondary">
        </div>
    </form>
    <div class="text-center mt-3">
        <a href="index.jsp" class="btn btn-link">Back</a>
    </div>
</div>
</body>
</html>
