<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	<fieldset>
		<h3>Tela de Login</h3><br>	
		<form action="ServletLogin" method="post">
			Usuário: <input type="text" name="usuario"><br>
			Senha: <input type="password" name="senha">
			<p><input type="submit" value="LOGAR" ></p>
		</form>
	</fieldset>

</body>
</html>