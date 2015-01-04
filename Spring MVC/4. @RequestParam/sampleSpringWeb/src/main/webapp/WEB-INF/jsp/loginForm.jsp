<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>Login Form</title>
</head>
<body>
	<form action="hello" method="POST">
		Username : <input type="text" name="userName"/><br/>
		<input type="submit">
	</form>
</body>
</html>