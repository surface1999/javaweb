<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>menu</title>
</head>
<body>
	<h5>Xin chào: <%= session.getAttribute("name").toString() %></h5>
	<a href="t1.jsp">Trang chủ</a>
	<a href="t2.jsp">Giỏ hàng</a>
</body>
</html>