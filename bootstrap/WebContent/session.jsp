<%@page import="func.funct"%>
<%@page import="bean.cartBean"%>
<%@page import="bean.SachBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/cart.css">
<title>Cart</title>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<%
		funct f = new funct();
		ArrayList<cartBean> listCart = new ArrayList<cartBean>();
		cartBo carts = null;
		int sum = 0;
		if (request.getAttribute("carts") != null) {
			carts = (cartBo) request.getAttribute("carts");
			listCart = carts.getListCart();
			sum = listCart.size();
		}
	%>
	<div class="my-3 ml-5 d-flex justify-content-between">
		<p class="m-0 font-weight-bold text-danger">
			<%
				if (sum != 0) {
					if (request.getAttribute("id") != null) {
						id = request.getAttribute("id").toString();
			%>

			<span class="text-success"
				style="font-size: 18px; text-transform: capitalize;">Chào <%=id%>!&nbsp;
			</span>
			<%
				}
			%>
			Giỏ hàng của bạn có
			<%=sum%>
			sản phẩm.
			<%
				} else {
			%>
			Hiện tại giỏ hàng của bạn không có sản phẩm nào.
			<%
				}
			%>
		</p>
		<%
			if (id != null) {
		%>
		<a class="btn btn-dark mr-5" href=<%="history?userID=" + id%>>Xem
			lịch sử mua hàng của bạn</a>
		<%
			}
		%>
	</div>
	<%
		if (listCart.size() > 0) {
	%>
	<div class="session d-flex justify-content-center">
		<form action="cart" method="post">
			<table class="cart m-4">
				<tr class="bg-dark text-light">
					<td><input class=" btn btn-danger ml-3" type="submit"
						value="Delete"></td>
					<th class="pr">STT</th>
					<th class="pr">Hình ảnh</th>
					<th class="pr">Tên sách</th>
					<th class="pr">Giá bán</th>
					<th class="pr">Số lượng</th>
					<th colspan="2" class="pr">Thành tiền</th>
				</tr>
				<%
					int i = 1;
						for (cartBean cart : listCart) {
				%>
				<tr <%if (i % 2 == 0) {%> style="background: #ffff;" <%}%>>
					<td><input class="ml-3" type="checkbox"
						name="<%=cart.getMs().trim()%>"></td>
					<td class="pr"><%=i%></td>
					<td class="pr"><img alt="" src="<%="photo/" + cart.getAnh()%>"
						style="height: 4rem; width: 3.4rem;"></td>
					<td class="pr"><%=cart.getTh()%></td>
					<td class="pr"><%=f.formart(cart.getGia())%> đ</td>
					<td>
						<div class="d-flex align-items-center justify-content-center">
							<span class=" py-1  text-center border border-dark "
								style="width: 2.5rem; background-color: #D4D2D2;"><a
								class="text-dark unline" href=<%="cart?c=g&ms=" + cart.getMs()%>>-</a>
							</span> <span
								class=" py-1 text-center border-top border-bottom border-dark "
								style="width: 2.5rem;"><%=cart.getSoLuong()%> </span> <span
								class=" py-1 text-center border border-dark "
								style="width: 2.5rem; background-color: #D4D2D2;"><a
								class="text-dark unline" href=<%="cart?c=t&ms=" + cart.getMs()%>>+</a>
							</span>
						</div>
					</td>
					<td class="pr"><%=f.formart(cart.getThanhTien())%> đ</td>
					<td><a href=<%="remove-cart?ms=" + cart.getMs()%>><i
							class="fas fa-times-circle cursor mr-4 text-dark"></i></a></td>
				</tr>
				<%
					i++;
						}
				%>
				<tr <%if (i % 2 == 0) {%> style="background: #ffff;" <%}%>>
					<td colspan="5" class="pr"><b>Tổng cộng</b></td>
					<td align="center" class="pr"><b><%=carts.tongSL()%></b></td>
					<td colspan="2"><b class="text-danger pr"><%=f.formart(carts.TongTien())%>
							đ</b></td>
				</tr>
				<tr>
					<td colspan="6"></td>
					<td class="pr"><a class="btn btn-dark"
						href=<%=id != null ? "pay?userID=" + id : "pay"%>>Đặt mua</a></td>
				</tr>
			</table>
		</form>
	</div>
	<%
		}
	%>
</body>
</html>