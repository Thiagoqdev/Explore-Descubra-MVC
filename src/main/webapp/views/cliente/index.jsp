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
<link rel="stylesheet" href="././assets/css/reset.css" />
<link rel="stylesheet" href="././assets/css/style_home.css" />
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
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"><img
					src="./assets/imagens/logoSite.png" alt="Logo" width="40"
					height="30" class="d-inline-block align-text-top" /> >Explore e
					Descubra </a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end"
					id="navbarSupportedContent">
					<ul class="navbar-nav mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.html">Home</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="Destinos.html">Destino</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="Promoções.html">Promoções</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="Contato.html">Contato</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="Cadastro.html">Cadastre-se</a></li>
					</ul>

					<div class="dropdown">
						<a class="btn btn-warning dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Crud </a>

						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="cliente">Clientes</a></li>
							<li><a class="dropdown-item" href="pacotes">Pacotes</a></li>
							<li><a class="dropdown-item" href="compra">Compras</a></li>
						</ul>
					</div>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<header class="header">
			<h1 class="text-center mt-5">Clientes</h1>
		</header>

		<section class="container cliente-crud">
			<div class="p-4">
				<table class="table table-responsive table-hover">
					<thead class="table-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Nome</th>
							<th scope="col">Cpf</th>
							<th scope="col">E-mail</th>
							<th scope="col">Ações</th>
						</tr>
					</thead>
					<tbody>

						<jstl:forEach items="${listaClientes}" var="c">
							<tr>
								<td>${c.id}</td>
								<td>${c.nome}</td>
								<td>${c.cpf}</td>
								<td>${c.email}</td>
								<td>
									<div class="d-flex">
										<a href="cliente-edit?id=${c.id}" class="mx-1" title="Editar">
											<i class="ri-file-edit-line"></i>
										</a> <a href="cliente-delete?id=${c.id}" class="mx-1"
											title="Cancelar"
											onclick="return confirm('Deseja excluir o autor ${c.nome}.')">
											<i class="ri-delete-bin-2-line"></i>
										</a>
									</div>
								</td>
							</tr>
						</jstl:forEach>

					</tbody>
				</table>
				<div class="d-flex justify-content-end mt-4">
					<a href="./views/cliente/create.jsp"
						class="btn btn-success mb-2 botao1"> Novo Usuario </a>
				</div>
			</div>
		</section>
	</main>
	<footer class="bg-footer">
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
