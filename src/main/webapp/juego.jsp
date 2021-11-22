<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<style>			
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
		    <img src= <%= image %> style="height:450px;">
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
<head>
<meta charset="ISO-8859-1">
<title>Cuenta hasta el numero recibido</title>
</head>
<body>
	<ul>
	
		session.setAttribute("usuario", request.getParameter("usuario"));
	
		int max = Integer.parseInt(request.getParameter("maximo"));
		if(max>=1){
			for(int i=1; i<max; i++){
				out.println("<li>"+i+"</li>");
			}
		} else {
			for(int i=max; i<0; i++){
				out.println("<li>"+i+"</li>");
			}
		}
	%>
	</ul>
	<ul>
		<form action="despidete.jsp" method="get">
			<input type="submit" value="Salir">
		</form>
	</ul>
</body>

 -->