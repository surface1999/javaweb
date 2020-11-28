<%@page import="bean.billBean"%>
<%@page import="bo.payBo"%>
<%@page import="bean.purchaseHistoryBean"%>
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
		ArrayList<billBean> history = null;
		int sum = 0;
		if (request.getAttribute("history") != null) {
			history = (ArrayList<billBean>) request.getAttribute("history");
			sum = history.size();
		}
	%>
	<div class="my-3 ml-5 d-flex justify-content-between">
		<p class="m-0 font-weight-bold text-danger">
			<span class="text-success"
				style="font-size: 18px; text-transform: capitalize;">Chào <%=id%>!&nbsp;
			</span>
			<%
				if (sum != 0) {
			%>
			Đây là lịch sử mua hàng của bạn.
			<%
				} else {
			%>
			Hiện tại lịch sử mua hàng của bạn chưa có sản phẩm nào.
			<%
				}
			%>
		</p>

	</div>
	<%
		if (history != null) {
			for (billBean x : history) {
	%>

	<div class="session d-flex justify-content-center">
		<table class="cart m-4">
			<tr>
				<td class="pr"><span class="font-weight-bold">Mã đơn hàng:</span></td>
				<td><span class="font-weight-bold text-success"><%=x.getOrderID() %></span></td>
				<td class="pr"><span class="font-weight-bold">Ngày mua:&nbsp;<%=x.getDate() %></span></td>
				<td class="pr" colspan="4"></td>
			</tr>
			<tr class="bg-dark text-light">
				<th class="pr">STT</th>
				<th class="pr">Hình ảnh</th>
				<th class="pr">Tên sách</th>
				<th class="pr">Trạng thái</th>
				<th class="pr">Giá bán</th>
				<th class="pr">Số lượng</th>
				<th class="pr">Thành tiền</th>
			</tr>
			<%
				int i = 1;
						ArrayList<purchaseHistoryBean> list = x.getListItem();
						for (purchaseHistoryBean item : list) {
			%>
			<tr <%if (i % 2 == 0) {%> style="background: #ffff;" <%}%>>
				<td class="pr"><%=i%></td>
				<td class="pr"><img alt="" src="<%="photo/" + item.getImg()%>"
					style="height: 4rem; width: 3.4rem;"></td>
				<td class="pr"><%=item.getTensach()%></td>
				<td class="pr"><p
						class=<%=item.getStatus() == 0 ? "text-danger" : "text-success"%>
						style="font-weight: bold;"><%=item.getStatus() == 0 ? "Chưa thanh toán" : "Đã thanh toán"%>
					<p></td>
				<td class="pr"><%=f.formart(item.getGiaBan())%> đ</td>
				<td class="pr"><%=item.getSoLuong()%></td>
				<td class="pr"><%=f.formart(item.getThanhTien())%> đ</td>
			</tr>
			<%
				i++;
						}
			%>
			<tr <%if (i % 2 == 0) {%> style="background: #ffff;" <%}%>>
				<td colspan="5" class="pr"><b>Tổng cộng</b></td>
				<td class="pr"><b><%=x.getTongSL()%></b></td>
				<td><b class="text-danger pr"><%=f.formart(x.getTongTien())%>
						đ</b></td>
			</tr>
		</table>
	</div>
	<%
		}
		}
	%>
</body>
</html>