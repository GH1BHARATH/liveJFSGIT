```html
<%@page language="java"%>
<%@page import="java.util.List"%>
<%@page import="java.io.IOException"%>
<%@page import="com.ezshop.model.Product"%>
<%@page import="com.ezshop.repository.ProductRepository"%>

<html>
<body>
	<h1>Display Products</h1>
	<%
	for (int i = 0; i < 5; i++) {
	%>

	<%
	out.println(i);
	%>
	<h1><%=i%></h1>
	<%
	}
	%>

	<%
	ProductRepository productRepository = new ProductRepository();
	List<Product> productsList = productRepository.findAll();
	if (productsList.size() > 0) {
		for (Product product : productsList) {
			out.println(product);
		}
	}
	%>

</body>
</html>


```
