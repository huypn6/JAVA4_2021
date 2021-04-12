<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<nav>
	<ul>
		<li>
			<a href="<%= request.getContextPath() %>/index"><fmt:message key="a.home"/></a>
		</li>
		
		<li>
			<a href="<%= request.getContextPath() %>/product">Product</a>
		</li>
		<li>
			<a href="<%= request.getContextPath() %>/contact"><fmt:message key="a.abc"/></a>
		</li>
	</ul>
		
</nav>