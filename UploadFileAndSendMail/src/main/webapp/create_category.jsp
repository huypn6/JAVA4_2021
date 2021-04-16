<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Create Category
	<form action="<%=request.getContextPath()%>/category/create" method="post">
		Category Name: <input name="name"/><br>
		Category Name: <input name="age"/><br>
		<input type="submit" value="Create"/>
	</form>
</body>
</html>