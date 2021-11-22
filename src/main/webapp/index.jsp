<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<style>
			table, th, td {
			  padding-top:50px;
			}

			#grad1 {
			  height: auto;
			  background-color: gray; /* For browsers that do not support gradients */
			  background-image: linear-gradient(rgb(192,192,192), white);
			}
		</style>	
	</head>
	
	<body id="gard1">
		<div align="center">
			<form action="juego.jsp" method="post">
			<table class="table">
				<tr>					
					<label for=jugador>Nombre: </label>			
					<input type="text" placeholder="nombre" name="usuario"><br>
				</tr>
				<tr>			
					<label for=dificultad>Dificultad: </label>
					<select name="dificultad">
						<option value="facil">Facil</option>
						<option value="normal">Normal</option>
						<option value="dificil">Dificil</option>
					</select><br>
				</tr>
				<tr>
					<label for=diccionario>Tema: </label>
					<select name="category">
					    <c:forEach items="${listCategory}" var="category">
					        <option value="${category.id}">${category.name}</option>
					    </c:forEach><br><br>
					    <input type="submit" name="Jugar">
					</select>				
				</tr>			
			</table>
			</form>
		</div>
	</body>
</html>

	<!--
	
	-->