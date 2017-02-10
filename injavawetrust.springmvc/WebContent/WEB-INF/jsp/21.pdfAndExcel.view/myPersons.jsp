<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<h3>Person List</h3>

	<table border="1px" cellpadding="8px">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Surname</td>
			<td>BirthYear</td>
		</tr>

		<c:forEach items="${persons}" var="person">
			<tr>
				<td><c:out value="${person.id}" /></td>
				<td><c:out value="${person.name}" /></td>
				<td><c:out value="${person.surname}" /></td>
				<td><c:out value="${person.birthYear}" /></td>
			</tr>

		</c:forEach>
	</table>


	<table>
		<tr>
			<td>
				<form id="myForm" action="/injavawetrust.springmvc/pdfExport"
					method="POST">
					<input type="submit" value="PDF export">
					</button>
				</form>
			</td>

			<td>
				<form id="myForm" action="/injavawetrust.springmvc/excelExport"
					method="POST">
					<input type="submit" value="excelExport">
					</button>
				</form>
			</td>

			<td>
				<form id="myForm" action="/injavawetrust.springmvc/jExcelExport"
					method="POST">
					<input type="submit" value="jExcelExport">
					</button>
				</form>
			</td>

			<td>
				<form id="myForm" action="/injavawetrust.springmvc/xlsExport"
					method="POST">
					<input type="submit" value="xlsExport">
					</button>
				</form>
			</td>

			<td>
				<form id="myForm" action="/injavawetrust.springmvc/xlsxExport"
					method="POST">
					<input type="submit" value="xlsxExport">
					</button>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>