<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
	<head>
		<style>
		.dropbtn {
			  background-color: rgb(192,192,192);
			  color: black;
			  padding: 5px;
			  font-size: 14px;
			  border: none;
			}
			
			.dropdown {
			  position: relative;
			  display: inline-block;
			}
			
			.dropdown-content {
			  display: none;
			  position: absolute;
			  min-width: 160px;
			  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
			  z-index: 1;
			}
			
			.dropdown-content a {
			  color: black;
			  padding: 7px 14px;
			  text-decoration: none;
			  display: block;
			}
			
			.dropdown-content a:hover {background-color: #ddd;}
			
			.dropdown:hover .dropdown-content {display: block;}
			
			#grad1 {
			  height: auto;
			  background-color: gray; /* For browsers that do not support gradients */
			  background-image: linear-gradient(rgb(192,192,192), white);
			}
		</style>
		<meta charset="ISO-8859-1">
		<link href="bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet" />
		
		<title>Ahorcado Capa 8</title>
	</head>
	
	<body id="grad1">
		<div align="center" style="margin:10px;">
		    <h1 style="text-align:center">Juego del ahorcado<br></h1>		 
		</div>
		
		<table class="table">
          <tr>
            <th style="vertical-align: middle">Jugador: </th>
            <th style="vertical-align: middle">Juegos ganados: </th>
            <th style="vertical-align: middle">Juegos perdidos: </th>
            <th style="vertical-align: middle">Intentos restantes: </th>
            <th>
            	<div class="dropdown">
				  <button class="dropbtn">Opciones</button>
				  <div class="dropdown-content">
				    <a href="#">Dificultad</a>
				    <a href="diccionario.jsp">Diccionario</a>
				    <a href="palabras.jsp">Palabras</a>
				  </div>
				</div>
            </th>        
          </tr>
          <c:forEach var="hangmanView" items="${hangmanViews}">
          <tr>
            <td>
              <span class="label label-info">${hangmanView.playerName}</span>
            </td>
            <td>
              <span class="label label-info">${hangmanView.isPlayerWonTheGame}</span>
            </td>
            <td>
              <span class="label label-info">${hangmanView.isPlayerLostTheGame}</span>
            </td>
            <td>
              <span class="label label-info">${hangmanView.hangman.remainingMoves}</span>
            </td>
          </tr>
        </c:forEach>
      </table>
      
		
		<%
			String image = "images/img10.png";
		%>
	
		<div align="center">
		    <img src= <%= image %> style="height:480px;">
		</div>
		
		<div align="center">    
		    Letra:
		    <input type="text" name="letra" size="1" maxlength="1">
		    <br/>
		   <p>
		       <input type="hidden" name="id" value=""/>     
		       <input type="submit" name="boton_jugar" value="Jugar">
		       <c:if test="${hangmanView.isPlayerWonTheGame}">
			   	   <p>errors</p>
	               <form action="despidete.jsp" method="get">
					   <input type="submit" value="Salir">
				   </form>
           	   </c:if>
		   </p>
		   <c:if test="${hangmanView.isPlayerWonTheGame}">
		   	   <p>you won</p>
               <form action="ganar.jsp" method="get">
				   <input type="submit" value="Salir">
			   </form>
           </c:if>
		   <c:if test="${hangmanView.isPlayerWonTheGame}">
		   	   <p>you loss</p>
               <form action="perder.jsp" method="get">
				   <input type="submit" value="Salir">
			   </form>
           </c:if>
		   
		</div>
	</body>
</html>

	<!--
	<body>
		<%= new Date() %>
		<form action="cuenta.jsp" method="post">
			<input type="number" placeholder="0" name="maximo">
			<input type="text" placeholder="nombre" name="usuario">
			<input type="submit"> 
		</form>
	</body>
	-->