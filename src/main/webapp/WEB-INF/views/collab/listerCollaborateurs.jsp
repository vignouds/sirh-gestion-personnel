<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

</head>
<body>
		<h1>Les collaborateurs</h1>
		<ul>
		<%
		List<String> listeNoms = (List<String>)request.getAttribute("listeNoms");
		for(String nom : listeNoms) {
		%>		
			<li><%=nom %></li>
		<%
		}		
		%>
		</ul>
</body>
</html>