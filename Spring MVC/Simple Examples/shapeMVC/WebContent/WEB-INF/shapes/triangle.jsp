<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Triangle</title>
</head>
<body>
	Drawing triangle<br>
	<%
		shapeMVC.shapes.Triangle triangleObj=(shapeMVC.shapes.Triangle)request.getAttribute("shapeBean");
		out.println("Point A :- "+"X : "+triangleObj.getPointA().getX()+" Y : "+triangleObj.getPointA().getY());
		out.println("Point B :- "+"X : "+triangleObj.getPointB().getX()+" Y : "+triangleObj.getPointB().getY());
		out.println("Point C :- "+"X : "+triangleObj.getPointC().getX()+" Y : "+triangleObj.getPointC().getY());
	 %>
</body>
</html>