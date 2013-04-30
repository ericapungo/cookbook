<	%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<body>
	<jsp:include page="home.jsp"></jsp:include>

	<h3>Criar Nova Receita</h3>

	<form method="POST" action="/recipes">
		<table>
			<tr>
				<td align="right">Titulo:</td>
				<td><input type="text" name="titulo" /></td>
			</tr>
			<tr>
				<td align="right">Problema:</td>
				<td><input type="text" name="problema" /></td>
			</tr>
			<tr>
				<td align="right">SoluÁ„o:</td>
				<td><input type="text" name="solucao" /></td>
			</tr>
			<tr>
				<td align="right">Autor:</td>
				<td><input type="text" name="autor" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Criar Nova Receita" /></td>
			</tr>
		</table>
	</form>
</body>