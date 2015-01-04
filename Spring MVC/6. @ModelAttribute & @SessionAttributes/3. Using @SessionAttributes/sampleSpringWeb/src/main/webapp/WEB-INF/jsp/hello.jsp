<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>User Detail</title>
</head>
<body>
	<h1>Welcome ${userDetail.username}</h1>
	Email : <c:out value="${userDetail.email}"/><br/>
	Age : <c:out value="${userDetail.age}"/><br/>
	Phone : <c:out value="${userDetail.phone}"/><br/>
</body>
</html>