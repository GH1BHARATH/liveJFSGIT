<!DOCTYPE html>
<html>
<head>

<title>Insert Products</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<form method="post" action="/EzShopWebAppV1/products">
	
	<div class="container" style="padding:250px; background-color:cyan">
		Product Id : <input type="text" name="productId" class="form-control"/><br /> Product
		Name : <input type="text" name="productName" class="form-control"/><br /> 
		Product Price : <input type="text" name="price" class="form-control" /><br /> 
		Quantity : <input type="text" name="quantity" class="form-control" /><br /> 
		<input type="submit" value="Save Product" class="btn btn-success" />
		</div>
	</form>
</body>
</html>