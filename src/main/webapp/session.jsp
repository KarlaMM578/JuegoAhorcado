<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<style>
			select {
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
		<title>Ahorcado Capa 8</title>
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
	
		<!-- 
		
		<form action="controller" method="post">
			<input type="text" placeholder="Ingrese una letra" name="letra"/>
			<input type="submit" name="HOME_PAGE" value="Enviar"/>
			<input type="submit" name="rendirce" value="Me rindo"/>
		</form>
		
		 -->

		<div class="wrapper style1">
			<div id="header" class="skel-panels-fixed">
				<div id="logo">
					<h1>Capa 8</h1>
					<span class="=tag">Karla, Jonathan, Uriel</span>
				</div>
			</div>
		</div>

		<div id="page" class="container">
			<section>
				<header class="major">
					<center><h2>Juego del Ahorcado</h2></center>
				</header>
			</section>
		</div>

		<div id="main" class="displayed">
			<div class="container">
				<center><img class="displayed" src="images/p_JEE_3.png" alt="Ahorcado"/></center>
			</div>
		</div>

		<div id="footer" class="wrapper style2">
			<div class="container">
				<section>
					<header class="major">
						<h2>Configuracion</h2>
						<span class="byline">Elige las opciones de juego</span>
					</header>
					<form method="post" action="Ahorcados">
						<div class="row half">
							<div class="12u">
								<input class="text" type="text" name="name" id="name" placeholder="Nombre" />
							</div>
						</div>
						<div class="row half">
							<div class="12u">
								<select name="dificultad">
									<option value="facil">Facil</option>
									<option value="normal">Normal</option>
									<option value="dificil">Dificil</option>
								</select>
							</div>
						</div>
						<div class="row half">
							<div class="12u">
								<select name="category">
									<c:forEach items="${listCategory}" var="category">
										<option value="${category.id}">${category.name}</option>
									</c:forEach>					
								</select>
							</div>
						</div>
						<div class="row half">
							<div class="12u">
								<ul class="actions">
									<li>
										<input type="submit" value="Ingresar" class="button alt" />
									</li>
								</ul>
							</div>
						</div>
					</form>
				</section>
			</div>
		</div>

		<div id="copyright">
			<div class="container">
				<span class="copyright">Nada que mostrar por el momento</span>
			</div>
		</div>

	</body>	
</html>