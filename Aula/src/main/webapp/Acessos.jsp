<%@page import="aula08.Contador"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Acessos</title>
</head>
<body>
<!-- aula08. ~seleciona a classe que imporatará automáticamente -->
<% Contador.novoAcesso(); %>
Quantidade de acessos:
<b><%= Contador.getQuantidadeAcessos() %></b>
</body>
</html>