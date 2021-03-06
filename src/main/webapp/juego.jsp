<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<style>
			input[type=text], select {
				width: 100%;
				padding: 12px 20px;
				margin: 8px 0;
				display: inline-block;
				border: 1px solid #ccc;
				border-radius: 4px;
				box-sizing: border-box;
			}
			input[type=submit] {
				width: 100%;
				background-color: #ffffff;
				color: rgb(0, 0, 0);
				padding: 14px 20px;
				margin: 8px 0;
				border: none;
				border-radius: 4px;
				cursor: pointer;
			}
		</style>
		<title>Ahorcado</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />		
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.dropotron.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-wide.css" />
		</noscript>		
	</head>
	
	<body>

		<div class="wrapper style1">
			<div id="header" class="skel-panels-fixed">
				<div id="logo">
					<h1>Juego del Ahorcado</h1>					
				</div>
			</div>
		</div>		
		
		<table class="table">
          <tr>
            <th style="vertical-align: middle">Jugador: </th>
            <th style="vertical-align: middle">Dificultad: </th>
            <th style="vertical-align: middle">Juegos ganados: </th>
            <th style="vertical-align: middle">Juegos perdidos: </th>
            <th style="vertical-align: middle">Intentos restantes: </th>        
          </tr>
          <c:forEach var="hangmanView" items="${hangmanViews}">
          <tr>
            <td>            
              <span class="label label-info">
              	<%
					out.print(request.getAttribute("nombre"));
				%>
              </span>
            </td>
            <td>
              <span class="label label-info">
              	<%
					out.print(request.getAttribute("dificultad"));
				%>
              </span>
            </td>
            <td>
              	<span class="label label-info">
					<%
						out.print(request.getAttribute("numGanados"));
					%>
				</span>
            </td>
            <td>
              <span class="label label-info">
					<%
						out.print(request.getAttribute("numPerdidos"));
					%>
				</span>
            </td>
            <td>
				<span class="label label-info">
					<%
						out.print(request.getAttribute("numIntentos"));
					%>
				</span>
            </td>
          </tr>
        </c:forEach>
      </table>
      
		<%
			String image = "images/img10.png";
		%>

		<div id="main" class="displayed">
			<div class="container">
				<center><img class="displayed" src= <%= image %> style="height:450px; alt="Ahorcado"/></center>
			</div>
		</div>
		
		<div>		    
		    <input type="text" name="letra" size="1" maxlength="1">		    		   
		    <input type="hidden" name="id" value=""/>     
		    <input type="submit" name="boton_jugar" value="Jugar">
		    <c:if test="<% out.print(request.getAttribute("numIntentos")); %>">
				<img src="images/img<%=intentos %>.png" height="450"/ alt="3">
           	</c:if>		   
		   <c:if test="<% out.print(request.getAttribute("ganar")); %>
				<%
					String redirectURL = "ganar.jsp";
					response.sendRedirect(redirectURL);
				%>
			</c:if>">		   	   
			<c:if test="<% out.print(request.getAttribute("perder")); %>
				<%
					String redirectURL = "perder.jsp";
					response.sendRedirect(redirectURL);
				%>
			</c:if>">
		   
		</div>
	</body>
</html>