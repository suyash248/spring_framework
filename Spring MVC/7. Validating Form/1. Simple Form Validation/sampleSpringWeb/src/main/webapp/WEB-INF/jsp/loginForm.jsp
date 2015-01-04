<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="sf"  uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<title>Login Form</title>
</head>
<style>
.error {
    color: #ff0000;
    font-weight: bold;
}
</style>
<body>

	<sf:form action="showDetails" modelAttribute="userDetail" method="POST">
		<table>
			<sf:errors path="*" cssClass="error"/>
			<tr>
				<th><sf:label path="username">Username:</sf:label></th>
				<td><sf:input path="username"  /><br/>
					<sf:errors path="username" cssClass="error"/>
				</td>
			</tr>
			
			<tr>
				<th><sf:label path="email">Email:</sf:label></th>
				<td><sf:input path="email"  /><br/>
					<sf:errors path="email" cssClass="error"/>
				</td>
			</tr>
			
			<tr>
				<th><sf:label path="age">Age:</sf:label></th>
				<td><sf:input path="age"  /><br/>
					<sf:errors path="age" cssClass="error"/>
				</td>
			</tr>
			
			<tr>
				<th><sf:label path="phone">Phone:</sf:label></th>
				<td><sf:input path="phone"  /><br/>
					<sf:errors path="phone" cssClass="error"/>
				</td>
			</tr>
			
			<tr>
				<th></th>
				<td><input type="submit"/></td>
			</tr>
						
		</table>
	</sf:form>

</body>
</html>