<%@page import="com.vn.model.User"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error/500.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
<title>Insert title here</title>
</head>
<body>
	<div class="wraper header">
		<jsp:include page="template/header.jsp">
			<jsp:param name="name" value="Include Header file" />
		</jsp:include>
	</div>
	<div class="wraper side-bar">
		<jsp:include page="template/side-bar.jsp" />
	</div>
	
	<%
		int a = 4; int b= 5;
		int c = a/b;
	%>
	<%= new Date() %>
	<% out.print(new Date()); %>

	<%
	// cach 1
// 		User user = new User();
// 		user.setFirstName("huypn2");
// 		user.setFirstName("Pham nGOC");
// 		out.print(user.getFirstName());
// 		out.print(user.getLastName());
	%>
	
	<div class="wraper footer">
		<jsp:include page="template/footer.jsp" />
	</div>
	
	<jsp:useBean id="user" class="com.vn.model.User" scope="page"/>
	<jsp:setProperty name="user" property="firstName" value="Huy"/>
	<jsp:setProperty name="user" property="lastName" value="Pham"/>
	
<%-- 	<jsp:getProperty name="user" property="firstName"/> --%>
	${user.firstName} ${user.lastName}
	${user.fullName}
	
	


</body>
</html>