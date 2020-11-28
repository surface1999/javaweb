<%@page import="bo.cartBo"%>
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link href="fontawesome/css/fontawesome.css" rel="stylesheet">
<link href="fontawesome/css/brands.css" rel="stylesheet">
<link href="fontawesome/css/solid.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/nav.css" rel="stylesheet">
<title>Bootstrap</title>
</head>
<body>
<%
	String id = null;
	if(request.getAttribute("id") != null){
		id = request.getAttribute("id").toString();
	}
%>
	<nav class="navbar navbar-expand-lg navbar-dark light bg-dark  text-light sticky">
		<a class="navbar-brand text-danger" href="#"><i><h4>Surface1989</h4></i></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarTogglerDemo02"
			aria-controls="navbarTogglerDemo02" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse ml-5" id="navbarTogglerDemo02">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active mr-2"><a class="nav-link"
					href="/bootstrap/home">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item mr-2"><a class="nav-link" href="#">Loại
						sách</a></li>
				<li class="nav-item mr-2"><a class="nav-link" href="#">Bán
						chạy</a></li>
				<li class="nav-item mr-2"><a class="nav-link" href="#">Tác
						giả</a></li>
				<li class="nav-item mr-2"><a class="nav-link" href="#">NXB</a></li>
				<li class="nav-item mr-2"><a class="nav-link" href="#">Liên
						hệ</a></li>
				<li class="nav-item mr-2"><a class="nav-link" href="#">Feedback</a></li>

			</ul>
			<ul class="nav navbar-nav navbar-right mr-3">
				<%
					HttpSession ss = request.getSession();
					int n = 0;
					if (session.getAttribute("carts") != null) {
						cartBo carts = (cartBo) session.getAttribute("carts");
						n = carts.tongSL();
					}
				%>
				<li class="mr-3 smaller cursor"><a class="a" href="listcart"><i class="fas fa-cart-arrow-down text-danger font-size" style="font-size: 20px;"></i><span
						class="bg-success mr-1"
						style="padding: .15rem; border-radius: 10px; font-size: 10px;"><%=n%></span>&nbsp;Giỏ hàng</a></li>
				<%if(id == null){ %>
				<li class="smaller cursor"><a  href="login" class="a"><i
						class="fas fa-sign-in-alt mr-2 text-danger" style="font-size: 20px;"></i>Đăng nhập</a></li>
				<%}else{%>
					<li class="ml-5"><p class=" m-0 text-success">ID: <%=id %>!</p></li>
					<li class="smaller cursor ml-2"><a  href="log-out" class="a"><i
						class="fas fa-sign-out-alt mr-1 text-danger" style="font-size: 20px;"></i>Đăng xuất</a></li>
				<%} %>
			</ul>
		</div>
	</nav>
	<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>