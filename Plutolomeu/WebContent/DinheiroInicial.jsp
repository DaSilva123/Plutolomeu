<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,modelo.Cliente"%>
<%@ page import="java.util.List,modelo.Plutolomeu"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Inicial</title>
</head>
<body>

	
	
	Pagina Inicial <br />
	
	Plutolomeu tem : ${Plutolomeu.valorInicial}<br /> 
	
	
	Lista de cliente <br/>
	
	
	<ul>
		<c:forEach items="${clientes}" var="cliente">
			
			<li>
				${cliente.nome }
				<a href="/Plutolomeu/entrada?acao=RemoveCliente&id=${cliente.id }">remove</a>
				<a href="/Plutolomeu/entrada?acao=ListaCliente&id=${cliente.id }">edita</a>
				</li>
		</c:forEach>
	</ul>
	
</body>
</html>