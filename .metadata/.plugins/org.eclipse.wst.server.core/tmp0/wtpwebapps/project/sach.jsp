<%@page import="bean.SachBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.SachBo"%>
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<% SachBo a = new SachBo();
		ArrayList<SachBean> list = a.getSach();
	%>
	<div style=" display: grid;
			    grid-template-columns: 1fr 1fr 1fr;
			    grid-template-rows: 500px 500px 500px;"
	>
		<% for(SachBean sach : list){%>
			<div style="margin: 30px;">
				<img alt="" src="<%=sach.getAnh()%>" style="width: 60%;">
				<h5><%=sach.getTensach() %></h5>
				<h5><%=sach.getTacgia() %></h5>
				<h5><%=sach.getGia() %> dong</h5>
				<h5><%=sach.getMaloai()%></h5>
			</div>
		<%} %>
	</div>
	//b1: dùng bootstrap để tạo ra một menu: Trang chủ, giỏ hàng, thanh toán, lịch sử mua hàng, đăng nhập, đăng xuất;
	//b2: tạo ra loại bean gồm 2 trường: mã loại, tên loại, loaidao, loaibo
	//b3: Menu b1
	//	hiển thị các loại,  hiển thị các sách của các loại,  tạo form để đăng nhập

</body>
</html>