<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<head>
	 <meta http-equiv="content-type" content="text/html; charset=utf-8">	 
	 <link rel="stylesheet" href="resources/css/tiles.css" type="text/css"></link>
	 <title>Page Title</title>
	 <meta name="description" content="Write some words to describe your html page">
</head>
<body>
<div class="blended_grid">
		
	  <tiles:insertAttribute name="header" />
	
	  <tiles:insertAttribute name="menu" />

	  <tiles:insertAttribute name="body" />
	  
	  <tiles:insertAttribute name="footer" />
	  
</div>
</body>
</html>
