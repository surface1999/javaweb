<%@page import="func.funct"%>
<%@page import="bean.SachBean"%>
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@page import="bean.loaiBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaiBo"%>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/style.css">
<title>Surface1989</title>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<%
		funct f = new funct();
	%>
	<div class="row">
		<div class="col-md-2">
			<ul class="category">
				<%
					ArrayList<loaiBean> listLoai = (ArrayList<loaiBean>) request.getAttribute("listLoai");
					for (loaiBean loai : listLoai) {
				%>
				<li class="link-item"><a
					href=<%="category?ma=" + loai.getMaLoai()%>><%=loai.getTenLoai()%></a></li>
				<%
					}
				%>
			</ul>
		</div>
		<div class="col-md-7">
			<%
				ArrayList<SachBean> listSach = null;
				int index = 0, countPage = 0;
				if (request.getAttribute("listSach") != null) {
					listSach = (ArrayList<SachBean>) request.getAttribute("listSach");
					index = Integer.parseInt(request.getAttribute("page").toString());
					countPage = Integer.parseInt(request.getAttribute("countPage").toString());
				}
			%>
			<h5 class="text-danger ml-5 mt-3">
				Có:
				<%=request.getAttribute("countItems") != null ? request.getAttribute("countItems") : 0%>
				kết quả.
			</h5>
			<div class="row m-3">
				<%
					if (listSach != null) {
						for (SachBean sach : listSach) {
				%>
				<div class="col-md-4">
					<div class="card my-3"
						style="height: 30rem; width: 17rem; background: #F7F7F4">
						<img alt="" src="<%="photo/" + sach.getAnh()%>"
							style="height: 20rem;">
						<h5 class="p-1 font-weight-bold ml-3 "><%=sach.getTensach()%></h5>
						<h5 class="p-1 smaller ml-3"><%=sach.getTacgia()%></h5>
						<h5 class="p-1 text-danger font-weight-bold ml-3"><%=f.formart(sach.getGia())%>
							đ
						</h5>
						<a class="p-1 text-success font-weight-bold smaller ml-3"
							href=<%="cart?c=th&ms=" + sach.getMasach()%>
							style="cursor: pointer;"><i
							class="fas fa-cart-plus text-warning"></i> Thêm vào giỏ</a>
					</div>
				</div>
				<%
					}
				%>
				<nav class="mt-3" aria-label="Page navigation example"
					style="width: 100%;">
					<ul class="pagination d-flex justify-content-center">
						<li class="page-item"><a class="page-link text-dark" href="#"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
						<%
							if (request.getAttribute("loai") == null) {
									if (countPage >= 1) {
										for (int i = 1; i <= countPage; i++) {
						%>
						<li class="page-item"><a class="page-link text-dark"
							href=<%="home?page=" + i%>><%=i%></a></li>
						<%
							}
									}
								} else if((request.getAttribute("loai").toString().equals("loai"))){
									String ma = request.getAttribute("ma").toString();
									if (countPage >= 1) {
										for (int i = 1; i <= countPage; i++) {
						%>
						<li class="page-item"><a class="page-link text-dark"
							href=<%="category?ma=" + ma + "&page=" + i%>><%=i%></a></li>
												<%
							}
									}
								} else{
									String key = request.getAttribute("key").toString();
									if (countPage >= 1) {
										for (int i = 1; i <= countPage; i++) {
						%>
						<li class="page-item"><a class="page-link text-dark"
							href=<%="search?key=" + key + "&page=" + i%>><%=i%></a></li>
						<%
							}
									}
								}
						%>
						<li class="page-item"><a class="page-link text-dark" href="#"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</ul>
				</nav>
				<%
					}
				%>
			</div>
		</div>
		<div class="col-md-3">
			<div class="card mt-4 mr-5">
				<div class="card-header bg-dark text-light">
					<i class="fas fa-search mr-1"></i>Tìm kiếm
				</div>
				<form action="search" class="form-inline p-4" method="get">
					<%
						String key = "Nhập tên sách cần tìm kiếm.";
						if (request.getAttribute("key") != null) {
							key = request.getAttribute("key").toString();
						}
					%>
					<input class="form-control mr-sm-2" type="search"
						placeholder="<%=key%>" aria-label="Search" name="key">
					<button
						class="btn btn-outline-success my-2 my-sm-0 btn-dark text-light"
						type="submit">Search</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>