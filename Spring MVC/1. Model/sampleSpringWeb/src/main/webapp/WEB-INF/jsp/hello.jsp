<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>Spring MVC Example</title>
</head>
<body>
<h1>Welcome to Spring MVC</h1>
	<p>${message}</p>
	Name : ${name}<br/>
	Age : ${age}<br/>
	<b>Skills : </b>
		<c:forEach items="${skills}" var="skill">
			<br/>&nbsp;&nbsp; <c:out value="${skill}"></c:out>
		</c:forEach>
	</p>
</body>
</html>