<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
=======
<	%@ page language="java" contentType="text/html; charset=ISO-8859-1"
>>>>>>> b99a387add36f530669d18f896921a267ec95869
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<body>
	<jsp:include page="home.jsp"></jsp:include>

<<<<<<< HEAD
	<h3>Criar Receita</h3>



	 <form method="POST" action="/recipes">
   	  Titulo: <br />
      <textarea name="titulo" value="${recipe.title}" rows="2" cols="60"></textarea><br />
      <form action="adicionaReceitas" method="post">
      Problema: <br />
      <textarea name="problema" value="${recipe.problem}" rows="2" cols="60"></textarea><br />
      <form action="adicionaReceitas" method="post">
      Solucao: <br />
      <textarea name="solucao" value="${recipe.title}" rows="5" cols="60"></textarea><br />	
	  Autor: <br />
      <textarea name="autor" value="${recipe.author}"  rows="2" cols="60"></textarea><br />
      <form action="adicionaReceitas" method="post">
      Tags: <br />
      <textarea name="tags" value="${recipe.tags}" rows="2" cols="60"></textarea><br />
      <form action="adicionaReceitas" method="post">
      <input type="submit" value="Guardar Receita">
    </form>
 
=======
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
>>>>>>> b99a387add36f530669d18f896921a267ec95869
</body>