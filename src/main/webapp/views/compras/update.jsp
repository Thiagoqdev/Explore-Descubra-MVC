<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ page import="modelos.Clientes"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8" />
<link rel="stylesheet" href="./assets/css/reset.css" />
<link rel="stylesheet" href="./assets/css/style_home.css" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;700&family=Open+Sans:wght@300;400;700&display=swap"
	rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Orbitron:wght@400;500;700&display=swap"
	rel="stylesheet" />
<title>Explore e Descubra</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link
	href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
	rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<header>
	<main>
		<header class="header">
			<h1 class="text-center mt-5">Atualizar Compra</h1>
		</header>

		<section>

			<div class="container py-3">
				<form action="./compra-update">
					<input type="hidden" id="id" name="id" class="form-control"
						value="${compras.id}" />

					<div class="form-group mb-3">
						<label for="data_compras" class="form-label"> Data de compra </label> <input
							type="text" id="data_compras" name="data_compras" class="form-control"
							value="${compras.data_compras}" />
					</div>

					<div class="form-group mb-3">
						<label for="destino_pacotes" class="form-label"> Destino de pacote </label> <input
							type="text" id="destino_pacotes" name="destino_pacotes" class="form-control"
							value="${compras.destino_pacotes}" />
					</div>

					<div class="form-group mb-3">
						<label for="periodo_pacotes" class="form-label"> Periodo de pacote </label> <input
							type="number" id="periodo_pacotes" name="periodo_pacotes" class="form-control"
							value="${compras.periodo_pacotes}" />
					</div>

					<button type="submit" class="btn btn-primary">Enviar</button>
					<a href="./compras" class="btn btn-danger"
						style="margin-left: 10px"> Cancelar </a>
				</form>
			</div>


		</section>
	</main>
	<<footer class="bg-footer">
		<nav class="navbar bg-transparent">
			<div
				class="container-fluid d-flex justify-content-around pesquisa-footer">
				<a class="navbar-brand text-light">Explore e Descubra</a>
				<form class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder=""
						aria-label="Search" />
					<button class="btn btn-info" type="submit">procurar</button>
				</form>
			</div>
		</nav>
		<div class="barra-de-apresentação">
			<div class="informações-site">
				<h3>Galeria de aventuras!</h3>
				<img id="logo-company" src="./assets/imagens/logo-company.jpg"
					alt="logo do site" />
			</div>
			<div class="redes-sociais">
				<h3>Redes Sociais</h3>
				<ul class="rodape__social">
					<li><a href="" class="rodape__midia"></a><img
						src="./assets/imagens/facebook.png" alt="icone do facebook" /></li>
					<li><a href="" class="rodape__midia"></a><img
						src="./assets/imagens/twitter.png" alt="icone do twitter" /></li>
					<li><a href="" class="rodape__midia"></a><img
						src="./assets/imagens/instagram.png" alt="icone do instagram" /></li>
				</ul>
			</div>
			<nav class="formas-de-pagamento">
				<div class="cartoes-aceitos">
					<h3>Formas de Pagamento</h3>
					<ul class="rodape__navegacao">
						<li class="rodape__link"><a href="#"><img
								src="./assets/imagens/cards, credit icon icon.png" alt="" /></a></li>
						<li class="rodape__link"><a href="#"><img
								src="./assets/imagens/Amazon, Payment icon icon.png" alt="" /></a></li>
					</ul>
				</div>
			</nav>
		</div>
		<div class="desenvolvimento">Desenvolvido por Thiago Queiroz -
			2023</div>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>