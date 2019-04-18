<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Message Form</title>


<style>
.error {
	color: #ff0000;
}
</style>

</head>
<body>
	<h2>Registration Form</h2>

	<form:form method="POST" modelAttribute="message">
		<form:input type="hidden" path="id" id="id" />
		<table>
			<tr>
				<td><label for="name">Name: </label></td>
				<td><form:input path="name" id="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="msg">Message: </label></td>
				<td><form:input path="msg" id="msg" /></td>
				<td><form:errors path="msg" cssClass="error" /></td>
			</tr>



			<tr>
				<td colspan="3"><c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update" />
						</c:when>
						<c:otherwise>
							<input type="submit" value="Send" />
						</c:otherwise>
					</c:choose></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/list' />">List of All Messages</a>

</body>
</html>







