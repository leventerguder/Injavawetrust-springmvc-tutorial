<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="pageLeftMenu">
	<ul style="list-style: none; line-height: 28px;">


		<li><spring:url value="/page1" var="page1" htmlEscape="true" />
			<a href="${page1}">page1</a></li>
	
		<li><spring:url value="/page2" var="page2" htmlEscape="true" />
			<a href="${page2}">page2</a></li>

		<li><spring:url value="/page3" var="page3" htmlEscape="true" />
			<a href="${page3}">page3</a></li>


	</ul>
</div>
