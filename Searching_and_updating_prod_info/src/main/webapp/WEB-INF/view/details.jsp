<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updation of details</title>
</head>
<body>
<h3>Products Details Page</h3>
<hr>
<c:set var="product" value="${obj }"></c:set>
<h4>These are the details of product: ${product.product_id} </h4><br>
<table border=2>
	<tr><th>Id</th><th>NAME</th><th>PRICE</th></tr>
	
		<tr>
		<td>${product.product_id} </td>	
			<td>${product.product_name }</td>
			<td>${product.price } </td>
				
		</tr>	
	
	</table>

<br><br>
<h4>Change Product details</h4>
<p style="color:silver">Product Id should be :${product.product_id}</p>
<form action="sucess">
Product id : <input type="text" name="id" ><br><br>
<!-- Product id : ${product.product_id}<br>-->
Name: <input type="text" name="name" ><br><br>
Price : <input type="text" name="price" ><br><br>
<input type="submit" value="submit">
</form>

</body>
</html>