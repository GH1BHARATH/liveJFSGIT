<%@page language="java"%>
<%@page import="java.util.List"%>
<%@page import="java.io.IOException"%>
<%@page import="com.ezshop.model.Product"%>
<%@page import="com.ezshop.repository.ProductRepository"%>

<html>
<body>
<head>
    <style>
      /* selector */
      table,
      tr,
      td {
        border: 2px solid green;
      }
    </style>
</head>

	<h1>Display Products</h1>
	<%-- 	JSP DECLARATION --%>
	<%!ProductRepository productRepository = new ProductRepository();%>

	<%
	List<Product> productsList = productRepository.findAll();

	if (productsList.size() > 0) {
		for (Product product : productsList) {
	%>
	<h4 style='color: green'><%=product%></h4>
	<%	}	}	%>

	<br />
	<br />
	<br />
	<br />
	<br />
	<hr />

	<table>
		<tr style="border: 2px solid red">
			<th style="width: 200px">Product ID</th>
			<th style="width: 200px">Product Name</th>
			<th style="width: 200px">Price</th>
			<th style="width: 200px">Quantity</th>
		</tr>
		<%

	if (productsList.size() > 0) {
		for (Product product : productsList) {
	%>
		<tr>
			<td><%= product.getProductId() %></td>
			<td><%= product.getProductName() %></td>
			<td><%= product.getPrice() %></td>
			<td><%= product.getQuantity() %></td>
		</tr>
		<%	}	}	%>
	</table>
	<br />
	<br />
	<br />
	<br />
	<br />
	<hr />

	<!-- HTML COMMENT -->

	<%-- JSP COMMENT --%>
	<%-- for (int i = 0; i < 5; i++) {
	}
		--%>
	<%
	for (int i = 0; i < 5; i++) {
	%>

	<%
	out.println(i);
	%>

	<%-- 	JSP EXPRESSION --%>
	<h5><%=i%></h5>
	<%
	}
	%>


</body>
</html>

