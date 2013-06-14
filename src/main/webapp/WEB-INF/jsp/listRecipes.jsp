<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<title>Recipes List</title>
<body>
	<jsp:include page="home.jsp"></jsp:include>

	<h3>Receitas Criadas</h3>
	<c:forEach items="${recipes}" var="recipe">
		<a href="/recipes/${recipe.externalId}">${recipe.title}</a>
		<br /><br />
	</c:forEach>
</body>
