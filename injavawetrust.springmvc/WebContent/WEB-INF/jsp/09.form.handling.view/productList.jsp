<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="productUrlAll" value="${pageContext.request.contextPath}/products/all"/>
<c:set var="productUrlCategory" value="${pageContext.request.contextPath}/products/category"/>
<c:set var="matrixUrl" value="${pageContext.request.contextPath}/products/brand"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/sidebar.css" />" /> 
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css" />" />
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script>
function prepareMatrix(){
	
	var selectedBrands="";
	$('input:checkbox[name=brand]').each(function() 
		{    
			if($(this).is(':checked'))
				selectedBrands=selectedBrands+$(this).val()+",";
		});
	

	var url= '${matrixUrl}/brands='+selectedBrands;
		
	$("#search").attr("href", url);

}
</script>
	
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>Available products</p>
			</div>
		</div>
	</section>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">                    
                        Brands                  
                </li>
                
                <li>	              
		            <label class="label-align">
		  				<input type="checkbox" name="brand" value="apple"><span>Apple</span>
		  			 </label>	             
	            </li>
                
                <li>	              
		            <label class="label-align">
		  				<input type="checkbox" name="brand" value="google"><span>Google</span>
		  			 </label>	             
	             </li>
                <li>
                	<label class="label-align">
                    	<input type="checkbox" name="brand" value="samsung"><span>Samsung</span> 
                    </label> 	
                </li>
                          
                                               	
				<a style="margin-left:40px" onclick="prepareMatrix()"  id="search" class="btn btn-success"> <span>Search </span> 
				</a>
                
            </ul>
        </div>
		
	<div id="page-content-wrapper">
	<section class="container">
	
		<div class="row">
		<div class="col-md-6">
			<ul class="nav nav-tabs">
				<li class="">
					<a href="${productUrlAll}">All Products</a>
				</li>
				<li>
					<a href="${productUrlCategory}/laptop">Laptops</a>
				</li>
				<li class="">
					<a href="${productUrlCategory}/tablet">Tablets</a>
				</li>
				<li class="">
					<a href="${productUrlCategory}/smartPhone">Smart Phones</a>
				</li>
			</ul>
		</div>
	</div>
	
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p>${product.unitPrice}USD</p>
							<p>Available ${product.unitsInStock} units in stock</p>
							<p>
								<a
									href=" <c:url value="/products/product?id=${product.productId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
		</section>
		</div>
	</div>
</body>
</html>
