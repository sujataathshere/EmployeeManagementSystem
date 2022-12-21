<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<jsp:useBean id="eb" class="com.sujata.beans.EmployeeListBean" />
	<jsp:setProperty name="eb" property="*" />
	<c:choose>
		<c:when test="${param.action == 'del'}">
			${eb.delete()}
		</c:when>
		<c:otherwise>
			Invalid operation. <br />
			<br />
		</c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${eb.success == true}">
			<c:redirect url="employeelist.jsp" />
		</c:when>
		<c:otherwise>
			<a href="employeelist.jsp">See Emp List</a>
		</c:otherwise>
	</c:choose>

</body>
</html>
