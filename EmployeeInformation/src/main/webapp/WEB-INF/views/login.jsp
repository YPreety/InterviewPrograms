<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Login Form</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/registration.jsp">Registration</a>
	<form:form name="submitForm" method="POST">

		<div align="center">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
				<tr></tr>
				<tr>
					<td></td>
					<td><a href="${pageContext.request.contextPath}/home.jsp">Home</a></td>
				</tr>
			</table>
			<div style="color: red">${error}</div>

		</div>
	</form:form>
</body>
</html>