<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<jsp:useBean id="eb" class="com.sujata.beans.EmployeeListBean" />
	${eb.fetchEmployees()}

	<table border="1" cellpadding = "5" cellspacing = "5">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Address</td>
				<td>Gender</td>
				<td>Salary</td>
				<td>Birth Date</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${eb.employeeList}">
				<tr>
					<td>${e.employeeId}</td>
					<td>${e.name}</td>
					<td>${e.address}</td>
					<td>${e.gender}</td>
					<td><fmt:formatNumber value="${e.salary}" type="number"
							minFractionDigits="2" maxFractionDigits="2" /></td>
					<td>${e.birthDate}</td>
					<td><a href="action.jsp?id=${e.employeeId}&action=del">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script>
		function action() {
			alert("Are you sure want to delete employee?");
		}
	</script>
</body>
</html>