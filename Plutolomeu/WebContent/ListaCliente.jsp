<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,modelo.Cliente"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Clientes</title>
</head>
<body>

	<c:if test="${not empty cli}">
		Cliente ${ cli} cadastrada com sucesso!
	</c:if>
	
	Lista de Clientes: <br />
	
	<ul>
		<c:forEach items="${clientes}" var="cliente">
			
			<li>
				nome: ${cliente.nome } apelido ${cliente.apelido} rg: ${cliente.rg} cpf ${cliente.cpf }
				<a href="/Plutolomeu/entrada?acao=RemoveCliente&id=${cliente.id }">Matar</a>
				<a href="/Plutolomeu/entrada?acao=MostraCliente&id=${cliente.id }">edita</a>
				</li>
		</c:forEach>
	</ul>
	<a href="CadastrarCliente.jsp">cadastrar</a>
	
</body>
</html>



