<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="pageHeader">
	<h1>myheader</h1>


	<spring:url value="/menu1" var="menu1" htmlEscape="true" />
	<a href="${menu1}">myMenu1</a>

	<spring:url value="/menu2" var="menu2" htmlEscape="true" />
	<a href="${menu2}">myMenu2</a>

</div>