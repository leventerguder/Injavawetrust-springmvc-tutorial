<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- JSTL ve Spring form tagini ekleylelim.. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>person</title>

<!-- bootstrap ve jqery icin js ve css ekleme islemi.. -->

<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css" />" />
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>

</head>
<body>


<!-- butonun ismini ve url adresini dinamaik olarak degistirmek icin! -->

<c:url var="actionURL" value="/person.add"/>
<c:set var="buttonName" value="add"/>
<c:if test="${ !empty update}">
	<c:url var="actionURL" value="/person.update"/>
	<c:set var="buttonName" value="update"/>
</c:if>

<!-- http://www.layoutit.com/
https://datatables.net/examples/styling/bootstrap.html
 -->

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-6">
					
						<!-- modelAttribute , form data bind  -->
						<!-- newPerson ismi ile Controller'daki newPerson attribute isminin ayni olduguna dikkat edelim!  -->
						<form:form  modelAttribute="newPerson" class="form-horizontal" method="post" action="${actionURL}">
							<fieldset>

								<!-- Form Name -->
								<legend>Person Add</legend>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="name">Name</label>
									<div class="col-md-4">		
										<!-- update isleminde kullanmak icin hidden olarak id ! -->								
										<form:hidden path="id" />
										<form:input id="name" path="name" type="text" class="form-control input-md"/>
									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="surname">Surname</label>
									<div class="col-md-4">
										<form:input id="surname" path="surname" type="text" class="form-control input-md"/>
									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="salary">Salary</label>
									<div class="col-md-4">
										<form:input id="salary" path="salary" type="number" class="form-control input-md"/>
									</div>
								</div>

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" id="btnAdd" class="btn btn-primary" value ="${buttonName}"/>
									</div>
								</div>

							</fieldset>
						</form:form>
					</div>
					<div class="col-md-6"></div>
				</div>

				<div class="row">
					<div class="col-md-6">
					<legend>Person List</legend>
						<table id="example" class="table table-striped table-bordered"
							cellspacing="0" width="100%">
							<thead>
								<tr>
									<th>Id</th>
									<th>Name</th>
									<th>Surname</th>
									<th>Salary</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>

						<!-- Kayitlari listeleyelim... -->
								<c:forEach items="${allPersons}" var="person">
									<tr>
										<td><c:out value="${person.id}" /></td>
										<td><c:out value="${person.name}" /></td>
										<td><c:out value="${person.surname}" /></td>
										<td><c:out value="${person.salary}" /></td>
									<!-- Delete islemi icin RequestParam ekleyelim... -->	
										<td colspan="2"><a href="person.delete?personId=${person.id}"
											class="btn btn-danger" type="button">Delete</a>
									<!-- edit islemi icin RequestParam ekleyelim... -->			
											<a href="person.edit?personId=${person.id}"
											class="btn btn-warning" type="button">Edit</a>
											
											</td>									    
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="col-md-6"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>