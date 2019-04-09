<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar cliente</title>
</head>
<body>

	<form action="${linkEntradaServlet }" method="post">
	
		Nome: <input type="text" name="nome_cli"  />
		Apelido: <input type="text" name="apelido_cli"  />
		Rg: <input type="text" name="rg_cli"  />
		CPF: <input type="text" name="cpf_cli"  />
	    <input type="hidden" name="acao" value="AdicionaCliente">
		<input type="submit" />
	</form>

</body>
</html>