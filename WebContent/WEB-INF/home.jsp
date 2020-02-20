<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
	
	  <div class="p-3 my-3 bg-primary text-white">
	  	<div class="text-center">
	  		<h1 class="display-3">Phishing detection</h1>
	  	</div>
	  </div>
	  <form method="post" action="home">
	    <div class="form-group">
	      <label for="nom">URL:</label>
	      <input type="text" class="form-control" id="url"  name="url" value="${ requestScope.url }" placeholder="Entrez l'url du site">
	      <br> <span class="text-danger"> ${requestScope.urlError} </span>
	    </div>
	    <button type="submit" class="btn btn-primary">Vérifier</button>
	  </form>
	  <br><br>
	  <div class="text-center">
	  	<c:choose>
	  	<c:when test="${empty requestScope.result}">
	  	
	  	</c:when>
	  	<c:when test="${requestScope.result == 1}">
	  		<h1 class="alert alert-success">
	  			<strong>Légitime!</strong>
	  		</h1>
	  	</c:when>
	  	<c:when test="${requestScope.result == -1}">
	  		<h1 class="alert alert-danger">
	  			<strong>Phishing!</strong>
	  		</h1>
	  	</c:when>
	  	<c:when test="${requestScope.result == 0}">
	  		<h1 class="alert alert-warning">
	  			<strong>Suspect!</strong>
	  		</h1>
	  	</c:when>
	  	<c:otherwise>
	  		<h1 class="alert alert-info">
	  			<strong>Program Error!</strong>
	  		</h1>
	  	</c:otherwise>
	  </c:choose>
	  </div>
	</div>
	
	  
</body>
</html>