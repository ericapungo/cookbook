<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="home.jsp"></jsp:include>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Recipe ${recipe.externalId}</title>

</head>

<body>
	
	<h2>${recipe.title}</h2>
	<b>Problema:</b>
	<p>${recipe.problem}</p>
	<b>Solucao:</b>
	<p>${recipe.solution}</p>
	<b>Autor:</b>
	<p>${recipe.author}</p>
	<b>Tags:</b>
	<p>${recipe.tags}</p>
	<b>Data de Criacao:</b>
	<p>${recipe.timestampFormatted}</p>

	<table>
		<tr>
		
			<td><input type="button"
				onclick="location.href='/recipes/deleteRecipe/${recipe.externalId}'"
				value="Apagar Receita"></td>
				
			<td><input type="button"
				onclick="location.href='/recipes/edit/${recipe.externalId}'"
				value="Editar Receita"></td>
		</tr>
	</table>


</body>
</html>