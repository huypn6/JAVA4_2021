<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/product/create" method="post" enctype="multipart/form-data">
		Product Name: <input name="name"/><br>
		Image: <input type="file"/><br>
		<input type="submit" value="Create"/>
	</form>
</body>
</html>