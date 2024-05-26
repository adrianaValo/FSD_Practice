<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Participants Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Add Participants Details</h2>
    <form action="ParticipantsController" method="post" class="p-4 border rounded bg-light">
        <div class="mb-3">
            <label for="fname" class="form-label">First Name</label>
            <input type="text" name="fname" id="fname" class="form-control">
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age</label>
            <input type="number" name="age" id="age" class="form-control">
        </div>
        <div class="mb-3">
            <label for="phonenumber" class="form-label">Phone Number</label>
            <input type="text" name="phonenumber" id="phonenumber" class="form-control">
        </div>
        <div class="mb-3">
            <label for="bid" class="form-label">Batch</label>
            <select name="bid" id="bid" class="form-select">
                <core:forEach var="bid" items="${sessionScope.batches}">
                    <option value="<core:out value='${bid.getBid()}'/>">
                        <core:out value="${bid.getTypeofbatch()}"/> - <core:out value="${bid.getTime()}"/>
                    </option>
                </core:forEach>
            </select>
        </div>
        <div class="mb-3">
            <input type="submit" value="Add Participant" class="btn btn-primary">
            <input type="reset" value="Reset" class="btn btn-secondary">
        </div>
    </form>
    <div class="text-center mt-3">
        <a href="index.jsp" class="btn btn-link">Back</a>
    </div>
</div>
</body>
</html>
