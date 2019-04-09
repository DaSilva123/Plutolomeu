<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera</title>
</head>
<body>

	<form action="${linkEntradaServlet }" method="post">
	
		Nome: <input type="text" name="nome_cli" value = "${cliente.nome}"  />
		Apelido: <input type="text" name="apelido_cli" value = "${cliente.apelido}"  />
		Rg: <input type="text" name="rg_cli" value = "${cliente.rg}" />
		CPF: <input type="text" name="cpf_cli" value = "${cliente.cpf}" />
		<input type="hidden" name="id" value="${cliente.id }">
		
		<input type="hidden" name="acao" value="AlterarCliente">
		<input type="submit" />
	</form>

</body>
</html>