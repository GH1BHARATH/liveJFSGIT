<%@page language="java"%>
<%@page import="java.util.List"%>
<%@page import="java.io.IOException"%>
<%@page import="com.ezshop.model.Product"%>
<%@page import="com.ezshop.repository.ProductRepository"%>

<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Display Products</h1>
	<%-- 	JSP DECLARATION --%>
	<%!ProductRepository productRepository = new ProductRepository();%>

	<%
	List<Product> productsList = productRepository.findAll();
	%>

<hr/>
<br/><br/>
	<div class="container">
		<table class="table" style="width: 500px">
			<tr class="danger">
				<th>Product ID</th>
				<th >Product Name</th>
				<th >Price</th>
				<th >Quantity</th>
			</tr>
			<%
			if (productsList.size() > 0) {
				for (Product product : productsList) {
			%>
			<tr class="success">
				<td><%=product.getProductId()%></td>
				<td><%=product.getProductName()%></td>
				<td><%=product.getPrice()%></td>
				<td><%=product.getQuantity()%></td>
			</tr>
			<%
			}
			}
			%>
		</table>
	</div>
</body>
</html>

