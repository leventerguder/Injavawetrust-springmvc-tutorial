<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="pageLeftMenu">
	<ul style="list-style: none; line-height: 28px;">

		<li><spring:url value="/page4" var="page4" htmlEscape="true" />
			<a href="${page4}">page4</a></li>

		<li><spring:url value="/page5" var="page5" htmlEscape="true" />
			<a href="${page5}">page5</a></li>

		<li><spring:url value="/page5" var="page6" htmlEscape="true" />
			<a href="${page6}">page6</a></li>

	</ul>
</div>