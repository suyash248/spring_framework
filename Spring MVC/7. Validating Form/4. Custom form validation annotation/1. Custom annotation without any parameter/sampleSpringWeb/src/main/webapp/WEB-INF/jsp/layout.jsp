<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="/WEB-INF/jsp/include/cssIncludes.jsp"></jsp:include>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
		<jsp:include page="/WEB-INF/jsp/include/jsIncludes.jsp"></jsp:include>
		
		<div><tiles:insertAttribute name="header" /></div>
		<div style="float:left;padding:10px;width:15%;"><tiles:insertAttribute name="menu" /></div>
		<div style="float:left;padding:10px;width:80%;border-left:1px solid pink;">
		<tiles:insertAttribute name="body" /></div>
    	<div style="clear:both"><tiles:insertAttribute name="footer" /></div>

</body>
</html>
