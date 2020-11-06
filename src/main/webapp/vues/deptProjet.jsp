<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<body>
 <h1>Liste Des Projet de Departement: ${deptName}</h1>
 <table class="table ">
	  <thead class="thead-dark">
	
				<tr><th>id</th><th>titre</th><th>etat</th></tr>
	  </thead>
	
		<c:forEach items="${liste}" var="e">
			<tr><td>${e.id}</td><td>${e.titre}</td><td>${e.etat}</td><td><a class="btn btn-info" href="${cxt}/dept/${e.id}/employee">Consulter les Employes</a></td></tr>
		</c:forEach>
		
	</table>
	

<a href="${cxt }/ajoutProjet">Ajouter un projet</a>
<a href="${cxt }/ajoutEmployee">Ajouter un employe</a>
	<a href="${cxt}/home">Liste des departement</a>



</body>
</html>