<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<fieldset>
		<h3>Login</h3><br>	
		<form action="ServletLogin02" method="post">
			Usuário: <input type="text" name="usuario"><br>
			Senha: <input type="password" name="senha">
			<p><input type="submit" value="LOGAR" ></p>
		</form>
	</fieldset>
</body>
</html>