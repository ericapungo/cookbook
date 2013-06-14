<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<body>
	<jsp:include page="home.jsp"></jsp:include>

	<h3>Criar Nova Receita</h3>

	<form method="POST" action="/recipes/editRecipe/${recipe.externalId}">
				<table>
			<tr>
				<td align="right">Titulo:</td>
				<td><input type="text" name="titulo" value="${recipe.title}" /></td>
			</tr>	
			<tr>
				<td align="right">Problema:</td>
				<td><input type="text" name="problema" value="${recipe.problem}"  /></td>
			</tr>
			<tr>
				<td align="right">Solucao:</td>
				<td><input type="text" name="solucao" value="${recipe.solution}"  /></td>
			</tr>
			<tr>
				<td align="right">Autor:</td>
				<td><input type="text" name="autor" value="${recipe.author}"  /></td>
			</tr>
			<tr>
				<td align="right">Tags:</td>
				<td><input type="text" name="tags" value="${recipe.tags}"  /></td>
			</tr>
	
		<tr>
				
			<td><input type="submit" value="Gravar Alteracoes" /></td>
								
			<td><input type="button"
				onclick="location.href='/recipes/${recipe.externalId}'"
				value="<<--voltar"/></td>
		</tr>
	</table>
		
		
		</form>
</body>