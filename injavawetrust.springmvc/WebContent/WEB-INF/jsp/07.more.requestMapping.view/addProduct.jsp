<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css" />" />
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>Add products</p>
			</div>		
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="newProduct" class="form-horizontal" method="post">
			<fieldset>
				<legend>Add new product</legend>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId">Product Id</label>
					<div class="col-lg-10">
						<form:input id="productId" path="productId" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">Name</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitPrice">Unit price</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description</label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows = "2"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="manufacturer">Manufacturer</label>
					<div class="col-lg-10">				
						<!-- 								
						<form:select id="manufacturer" path="category" type="text" class="form:input-large">
							<form:option value="Apple">Apple</form:option>
							<form:option value="Google">Google</form:option>
							<form:option value="Samsung">Samsung</form:option>
						</form:select>
						 -->						 
					    <form:select id="manufacturer" path="manufacturer" type="text" class="form:input-large" items="${manufacturerList}"/>						
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="category">Category</label>
					<div class="col-lg-10">
						<!-- 
						<form:select id="category" path="category" type="text" class="form:input-large">
							<form:option value="Laptop">Laptop</form:option>
							<form:option value="Tablet">Tablet</form:option>
							<form:option value="Smart Phone">Smart Phone</form:option>
						</form:select>
						 -->
						 
						 <form:select id="category" path="category" type="text" class="form:input-large" items="${categoryList}"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitsInStock">Units In
						Stock</label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="condition">Condition</label>
					<div class="col-lg-10">
						<!-- 
						<form:radiobutton path="condition" value="New" />New 
						<form:radiobutton path="condition" value="Old" />Old 
						<form:radiobutton path="condition" value="Refurbished" />Refurbished
						 -->
						 
						 <form:radiobuttons path="condition" items="${conditionMap}"/>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
