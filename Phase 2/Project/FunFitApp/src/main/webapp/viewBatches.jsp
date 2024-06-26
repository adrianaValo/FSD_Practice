<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Batch Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Batch Details</h2>
    <table class="table table-bordered">
        <thead class="thead-dark">
            <tr>
                <th>Batch ID</th>
                <th>Type of Batch</th>
                <th>Time</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <core:forEach var="batch" items="${sessionScope.batches}">
                <tr>
                    <td><core:out value="${batch.getBid()}"/></td>
                    <td><core:out value="${batch.getTypeofbatch()}"/></td>
                    <td><core:out value="${batch.getTime()}"/></td>
                    <td>
                        <form action="BatchController" method="post" style="display:inline;">
                            <input type="hidden" name="action" value="delete">
                            <input type="hidden" name="bid" value="<core:out value='${batch.getBid()}'/>">
                            <button type="submit" class="btn btn-danger btn-sm">Delete</button>
                        </form>
                    </td>
                </tr>
            </core:forEach>
        </tbody>
    </table>
    <div class="d-flex justify-content-center mt-4">
        <a href="index.jsp" class="btn btn-secondary">Back</a>
    </div>
</div>
</body>
</html>
