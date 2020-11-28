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
<link
	href="https://fonts.googleapis.com/css2?family=Poppins&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/7e31e7a48c.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/Cart.css">
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
	<div class="py-3 d-flex justify-content-between"
		style="border-bottom: solid 1px #DFD7D7">
		<p class="m-0 ml-5 font-weight-bold text-danger">
			<span class="text-success"
				style="font-size: 17px; text-transform: capitalize;">Chào <%=id%>!&nbsp;
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


	<div class="session d-flex justify-content-center">
		<div>
			<%
				if (history != null) {
					int len = history.size();
					for (int j = len - 1; j >= 0; j--) {
						billBean x = history.get(j);
						String o_ID = x.getOrderID();
						int orderID = Integer.parseInt(o_ID);
						if (orderID >= 1 && orderID <= 9) {
							o_ID = "0" + o_ID;
						}
			%>
			<table class="cart m-5">
				<tr>
					<td class="pr" colspan="2"><span class="font-weight-bold">Mã
							đơn hàng:&nbsp;&nbsp;<span class="font-weight-bold text-danger"><%=o_ID%></span>
					</span></td>
					<td class="pr"><span class="font-weight-bold">Ngày
							mua:&nbsp;<%=x.getDate()%></span></td>
					<td class="pr" colspan="4"></td>
				</tr>
				<tr class="bg-dark text-light">
					<th class="pr">STT</th>
					<th class="pr">Hình ảnh</th>
					<th class="pr"><div style="width: 22rem;">Tên sách</div></th>
					<th class="pr">Trạng thái</th>
					<th class="pr"><div style="width: 5rem">Giá bán</div></th>
					<th class="pr">Số lượng</th>
					<th class="pr"><div style="width: 6rem">Thành tiền</div></th>
				</tr>
				<%
					int i = 1;
							ArrayList<purchaseHistoryBean> list = x.getListItem();
							for (purchaseHistoryBean item : list) {
				%>
				<tr <%if (i % 2 == 0) {%> style="background: #ffff;" <%}%>>
					<td class="pr"><%=i%></td>
					<td class="pr"><img alt="" src="<%=item.getImg()%>"
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

			<%
				}
				}
			%>
		</div>
	</div>
</body>
</html>