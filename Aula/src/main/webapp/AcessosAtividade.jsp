<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quantidade de Acessos</title>
</head>
<body>

	<%!private static int cont = 1;%>
	<%!private static java.util.Date PrimeiroAcesso;%>
	<%!private static java.util.Date UltimoAcesso;%>

	<%
	java.util.Date x = new java.util.Date();
	if (cont == 1) {
		PrimeiroAcesso = x;
	}
	else{
		UltimoAcesso = x;
	}
	%>

	Quantidade de Acessos:
	<%=cont%><br>
	Primeiro Acesso:
	<%=PrimeiroAcesso%><br>
	Último Acesso:
	<%=UltimoAcesso%>

	<%cont++;%>
</body>
</html>