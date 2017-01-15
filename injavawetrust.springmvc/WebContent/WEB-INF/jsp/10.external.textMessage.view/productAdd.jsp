<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css" />" />
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1><spring:message code="product.products"/></h1>				
			</div>										
		</div>
	</section>
	<section class="container">
		<form:form  commandName="newProduct" class="form-horizontal" method="post">
			<fieldset>
				<legend><spring:message code="product.add.newproduct"/>
				
				
						<span style="float:right">
							<a href="?language=tr" >
								<img src="${contextPath}/resources/images/TR.png" />						
							</a>
							|
							<a href="?language=en">
								<img src="${contextPath}/resources/images/EN.png" />
							</a>					
						</span>
				
				
				</legend>
    
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId">
						<spring:message code="product.id"/>
					</label>
					<div class="col-lg-10">
						<form:input id="productId" path="productId" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">
						<spring:message code="product.name"/>
					</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitPrice">
						<spring:message code="product.unit.price"/>
					</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">
						<spring:message code="product.description"/>
					</label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows = "2"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="manufacturer">
						<spring:message code="product.manufacturer"/>
					</label>
					<div class="col-lg-10">						 
					    <form:select id="manufacturer" path="manufacturer" type="text" class="form:input-large" items="${manufacturerList}"/>						
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="category">
						<spring:message code="product.category"/>
					</label>
					<div class="col-lg-10">						 
						 <form:select id="category" path="category" type="text" class="form:input-large" items="${categoryList}"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitsInStock">
						<spring:message code="product.stock"/>
					</label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="condition">
						<spring:message code="product.condition"/>
					</label>
					<div class="col-lg-10">
						  <c:forEach var="varCondition" items="${conditionMap}">
    						   <form:radiobutton path="condition" value="${varCondition.key}" /> 
    						   <spring:message code="product.${varCondition.value}"/>
						 </c:forEach> 
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="<spring:message code='product.add.button'/>"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
