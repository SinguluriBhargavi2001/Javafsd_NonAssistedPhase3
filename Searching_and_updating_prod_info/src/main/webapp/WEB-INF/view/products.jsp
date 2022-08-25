<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>

<h1> Products </h1>
<hr>
<table border=2>
	<tr><th>ID</th><th>NAME</th><th>PRICE</th></tr>
	<c:forEach var="p" items="${list }">	
		<tr>
			<td>${p.product_id }</td>
			<td>${p.product_name }</td>
			<td>${p.price }</td>		
		</tr>	
	</c:forEach>
	</table>

</body>
</html>