<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Participants Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Participants Details</h2>
    <table class="table table-bordered">
        <thead class="thead-dark">
            <tr>
                <th>Participant ID</th>
                <th>First Name</th>
                <th>Age</th>
                <th>Phone Number</th>
                <th>Batch ID</th>
            </tr>
        </thead>
        <tbody>
            <core:forEach var="participant" items="${sessionScope.participants}">
                <tr>
                    <td><core:out value="${participant.getPid()}"></core:out></td>
                    <td><core:out value="${participant.getFname()}"></core:out></td>
                    <td><core:out value="${participant.getAge()}"></core:out></td>
                    <td><core:out value="${participant.getPhonenumber()}"></core:out></td>
                    <td><core:out value="${participant.getBid()}"></core:out></td>
                    <td>
                        <form action="ParticipantsController" method="post" style="display:inline;">
                            <input type="hidden" name="action" value="delete">
                            <input type="hidden" name="pid" value="<core:out value='${participant.getPid()}'/>">
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
