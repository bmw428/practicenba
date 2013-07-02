<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<link rel="stylesheet" type="text/css" href="resources/extjs/resources/css/ext-all.css">
		<script type="text/javascript" src="resources/extjs/ext-debug.js"></script>
		<script type="text/javascript" src="resources/app.js"></script>
		
		<title>NBA</title>
		
		 <c:forEach items="${players}" var="player">
		 	<li>{player.lastName}</li>
		 </c:forEach>
	</head>
	<body>
	
	</body>
</html>