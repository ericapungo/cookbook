<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<body>
	<jsp:include page="home.jsp"></jsp:include>

	<h3>Pesquisar Receita</h3>

	 <form method="POST" action="/recipes/search">
	
			<textarea name="searchParams" placeholder= " Insira Parametros a Pesquisar"  rows="2" cols="60"></textarea><br/>
      		<input type="submit" value="Ir">
      		
		
	

</form>
</body>