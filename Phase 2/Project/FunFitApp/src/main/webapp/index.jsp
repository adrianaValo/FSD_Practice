<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FunFit Application</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center mb-4">FunFit Application!</h2>
		<div class="d-flex justify-content-center">
			<a href="addBatch.jsp" class="btn btn-primary me-2">Add Batch</a>
			<a href="BatchController?flag=2" class="btn btn-primary me-2">Add Participants</a>
			<a href="BatchController?flag=1" class="btn btn-primary me-2">View Batches</a>
			<a href="ParticipantsController" class="btn btn-primary">View Participants</a>
		</div>
	</div>
</body>
</html>