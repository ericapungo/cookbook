<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<body>
	<jsp:include page="home.jsp"></jsp:include>

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
 
</body>