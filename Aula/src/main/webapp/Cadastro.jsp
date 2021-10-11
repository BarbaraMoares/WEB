<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DadosPessoais</title>
</head>
<body>
	<fieldset>
		<form action="ServletTela1Cadastro">		
			<h3>Preencha seus Dados Pessoais</h3><br/>
				<label for="nome"> Nome: </label><input type="text" name="nome">
				<label for="sobrenome"> Sobrenome: </label><input type="text" name="sobrenome">
				<p> Endereço Residêncial: </p>
				<label for="rua"> Rua: </label><input type="text" name="rua">
				<label for="complemento"> Complemento: </label><input type="text" name="complemento"><br>
				<label for="cidade"> Cidade: </label><input type="text" name="cidade">
				<label for="estado"> Estado: </label><input type="text" name="estado">
				<label for="cep"> CEP: </label><input type="text" name="cep">
				<p><input type="submit" value="PRÓXIMO"></p>		
		</form>	
	</fieldset>
</body>
</html>