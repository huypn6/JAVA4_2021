<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<fmt:setBundle basename="home" scope="request"/>
<fmt:setLocale value="${language}" scope="request"/>

<style>
	.wraper {
	    padding: 0px 15px 0px 15px;
	}
	
	header, footer, nav {
		width: 100%;
		height: 100px;
		text-align: center;
	}
	
	section.main{
		flex-wrap: nowrap;
		height: 300px;
	}
	
	section.content{
		width: 70%;
	}
	
</style>
</head>
<body>
	<div class="wraper">
		<jsp:include page="template/header.jsp"/>
		<jsp:include page="template/menu.jsp"/>
		
		<section class="main">
			<section class="content">
				<jsp:include page="${view}"/>
			</section>
			<jsp:include page="template/side-bar.jsp"/>
			
		</section>
		<jsp:include page="template/footer.jsp"/>
		
	</div>
</body>
</html>