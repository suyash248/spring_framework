<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>Login Form</title>
</head>
<body>
	<form action="save" method="POST">
		<table>
		
			<tr>
				<th>Username : </th>
				<td><input type="text" name="username"></td>
			</tr>
			
			<tr>
				<th>Email : </th>
				<td><input type="text" name="email"></td>
			</tr>
			
			<tr>
				<th>Age : </th>
				<td><input type="text" name="age"></td>
			</tr>
			
			<tr>
				<th>Phone : </th>
				<td><input type="text" name="phone"></td>
			</tr>
			
			<tr>
				<td><input type="submit"/></td>
			</tr>
			
		</table>
	</form>
</body>
</html>