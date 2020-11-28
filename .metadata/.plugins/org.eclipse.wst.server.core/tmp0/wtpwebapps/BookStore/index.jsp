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
<link
	href="https://fonts.googleapis.com/css2?family=Poppins&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/7e31e7a48c.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/Style1.css">
<title>Surface1989</title>
</head>
<body class="bg-light">
	<%@include file="navbar.jsp"%>
	<%
		funct f = new funct();
	%>
	<div class="my-4">
		<%
			ArrayList<SachBean> listSach = null;
			int index = 0, countPage = 0;
			if (request.getAttribute("listSach") != null) {
				listSach = (ArrayList<SachBean>) request.getAttribute("listSach");
				index = Integer.parseInt(request.getAttribute("page").toString());
				countPage = Integer.parseInt(request.getAttribute("countPage").toString());
			}
		%>
		<div class="row" style="background-color: #f0f0f0; margin: 0 6rem;">
			<div class="col-md-3 bg-light">
				<ul class="category p-0 m-0 " style="width: 100%;">
					<%
						ArrayList<loaiBean> listLoai = null;
						if (request.getAttribute("listLoai") != null) {
							listLoai = (ArrayList<loaiBean>) request.getAttribute("listLoai");
							for (loaiBean loai : listLoai) {
					%>
					<li class="lk"><a
						href="<%="category?ma=" + loai.getMaLoai()%>"><div
								class="py-1 pl-3" style="width: 100%;"><%=loai.getTenLoai()%></div></a></li>
					<%
						}
						}
					%>
				</ul>
			</div>
			<div class="col-md-9 px-0">
				<div class="py-2 bg-light" style="width: 100%;">
					<p class="text-danger m-0 ml-5">
						Có:
						<%=request.getAttribute("countItems") != null ? request.getAttribute("countItems") : 0%>
						kết quả.
					</p>
				</div>
				<div class="px-4 py-2">
					<div class="row" style="min-height: 52vh;">
						<%
							if (listSach != null) {
								for (SachBean sach : listSach) {
						%>
						<div class="col-md-3 col-sm-6">
							<div class="card my-3 bg-light cursor"
								style="min-height: 500px;; width: 100%;">
								<a class="card-link" href="<%="sach_detail?ms=" + sach.getMasach()%>">
								 <img alt="" src="<%=sach.getAnh()%>"
									style="width: 100%; min-height: 290px;">
									<div class="p-1 mt-2  mx-3 " style="min-height: 70px;">
										<p class="m-0 font-weight-bold"><%=sach.getTensach()%></p>
									</div>
									<div class="p-1 mx-3" style="min-height: 50px;">
										<p class="m-0"><%=sach.getTacgia()%></p>
									</div>
									<h6 class="p-1 text-danger font-weight-bold ml-3"><%=f.formart(sach.getGia())%>
										đ
									</h6>
								</a> <a class="p-1 text-success font-weight-bold smaller ml-3"
									href="<%="cart?c=th&ms=" + sach.getMasach()%>"
									style="cursor: pointer;"><i
									class="fas fa-cart-plus text-warning"></i> Thêm vào giỏ</a>
							</div>
						</div>
						<%
							}
								int pre = index == 1 ? 1 : (index - 1);
								int next = index == countPage ? countPage : (index + 1);
								int start = index == 1 ? 1 : (index - 1);
								start = (index == countPage) && (index >= 3) ? index - 3 + 1 : start;
								int end = index == countPage ? countPage : (index + 1);
								end = (end - start + 1 < 3) && (end != countPage) ? start + 2 : end;

								String url1 = null;
								String url2 = null;
								String ma = null;
								String type = request.getAttribute("type").toString();
								switch (type) {
								case "home":
									url1 = "home?page=" + pre;
									url2 = "home?page=" + next;
									break;
								case "loai":
									ma = request.getAttribute("ma").toString();
									url1 = "category?ma=" + ma + "&page=" + pre;
									url2 = "category?ma=" + ma + "&page=" + next;
									break;
								default:
									key = request.getAttribute("key").toString();
									url1 = "search?key=" + key + "&page=" + pre;
									url2 = "search?key=" + key + "&page=" + next;
									break;
								}
								if (countPage > 0) {
						%>
						<nav class="mt-3" aria-label="Page navigation example"
							style="width: 100%;">
							<div class="page mt-2 mb-3"
								style="width: 20%; margin: auto; text-align: center;">
								Trang <span class="text-danger font-weight-bold"><%=index%></span>/
								<%=countPage%></div>
							<ul class="pagination d-flex justify-content-center">
								<li class="page-item"><a class="page-link text-dark"
									href="<%=url1%>" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
								</a></li>
								<%
									if (type.trim().equals("home")) {
												for (int i = start; i <= end; i++) {
								%>

								<li class="page-item"><a class="page-link text-dark"
									href="<%="home?page=" + i%>"><%=i%></a></li>
								<%
									}
											} else if (type.trim().equals("loai")) {

												for (int i = start; i <= end; i++) {
								%>
								<li class="page-item"><a class="page-link text-dark"
									href="<%="category?ma=" + ma + "&page=" + i%>"><%=i%></a></li>
								<%
									}
											} else {

												for (int i = start; i <= end; i++) {
								%>
								<li class="page-item"><a class="page-link text-dark"
									href="<%="search?key=" + key + "&page=" + i%>"><%=i%></a></li>
								<%
									}
											}
								%>
								<li class="page-item"><a class="page-link text-dark"
									href="<%=url2%>" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
								</a></li>
							</ul>
						</nav>
						<%
							}
							}
						%>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>