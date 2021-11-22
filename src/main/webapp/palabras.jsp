<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<style>
			body {
			  position: relative;
			  height: 100vh;
			  width:auto;
			  margin: 0;
			  background-color: gray; /* For browsers that do not support gradients */
			  background-image: linear-gradient(gray, white);
			}
			
			div {
			 position: absolute;
			 top: 50%;
			 transform: translateY(-50%);
			 width: 100%;
			 text-align: center;
			 margin: 0;
			}
		</style>
		<meta charset="ISO-8859-1">
		<title>Palabras</title>
	</head>
	
	<body>
		<div align="center" style="margin:10px;">
			<button type="button" name="back" onclick="history.back()">Volver</button>	
	 	</div>
	</body>
</html>