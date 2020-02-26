<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit The SignupDetails</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-primary bg-dark">
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarTogglerDemo01"
		aria-controls="navbarTogglerDemo01" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
		<a class="navbar-brand" href="Signup.jsp">Signup</a>
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0 ">
		</ul>
	<form class="form-inline my-2 my-lg-0">
	<a class="nav-link" href="Signup.jsp">Signup</a>
	</form>
	</div>
	</nav>
	<form action="Signup.do">
	<div class="container w-50%">
	<div class="card-body" align="front">
	<h2 class="card-title" font="bold">
	<b>Submit The SignupDetails</b>
	</h2>
	<div class="form-group">
	  <div class="form-group col-md-6">
	  <label for="Username"></label> <input name="Username" type="text"
	  class="form-control" placeholder="Username"
		id="Username">
	</div>

	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="Email"></label> <input name="Email" type="text"
		class="form-control" placeholder="Email"
		id="Email">
	</div>

	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="Password"></label> <input name="Password" type="text"
		class="form-control"placeholder="Password"
		id="Password">
	</div>
	
	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="ConformPassword"></label> <input name="ConformPassword" type="text"
		class="form-control"placeholder="ConformPassword"
		id="ConformPassword">
	</div>
	
	
		<button type="signup" class="btn btn-success">Signup</button>
	</div>
	
	<div class="text-center" align="center">
	<span style="color: green; font-family: cursive;">${successMessage}</span>
	<span style="color: red; font-family: cursive;">${failureMessage}</span>
	</div>
	
</form>
</body>
</html>