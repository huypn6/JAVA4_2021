<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/login" method="post">
	
		Username<input name="username"/></br>
		Password<input name="password"/></br>
		<input type="submit" value="Submit"/>
	
	</form>
</body>
</html>