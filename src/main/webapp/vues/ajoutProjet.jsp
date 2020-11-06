<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<c:set var="cxt" value="${pageContext.request.contextPath}" />

</head>
<body class="container">
<h1 style="margin-bottom:40px">Ajout Projet : </h1>


	  <div class="form-group" >
	
	<form:form method="POST" action="saveProjet" modelAttribute="projet" >
	 
	  <div class="form-group">
    <label for="exampleInputEmail1">titre:</label>
    <form:input path="titre" class="form-control" aria-describedby="titre"/>
  </div>
  
	
	

<div class="input-group">
  <div class="input-group-prepend">
  </div>
    <div class="form-group">
    <label for="exampleFormControlSelect1">Departement</label>
  
  <form:select class="custom-select"  path="dep.id" items="${listeDepartement}" itemValue="id" itemLabel="nom" ></form:select>
    </div>
</div>
		
	   <div class="form-group">
    <label for="exampleFormControlSelect1">etat</label>
  
  <form:select class="custom-select"  path="etat" >
  	<option value="en cour">en cour</option>
  	<option value="probleme">probleme</option>
  	<option value="terminee">terminee</option>
  	
  </form:select>
    </div>

		
		<button  class="btn btn-primary " type="submit" style="margin-top:40px"/>enregistrer</button>
	</form:form>
		<a href="${cxt}/home">Liste des departement</a>
	
</body>

</html>