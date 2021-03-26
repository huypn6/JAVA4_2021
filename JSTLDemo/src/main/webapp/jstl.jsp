<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 5, 5 ,6 , 7 });
	for (Integer element : list) {

	}
	request.setAttribute("list", list);
	%>

	<c:forEach begin="1" end="3" var="element" items="${list}">
		<c:out value="${element}" />
	</c:forEach>

</body>
</html>