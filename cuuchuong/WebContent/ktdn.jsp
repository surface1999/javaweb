<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//lay ve gia tri cua txtun va txt pass
		String un = request.getParameter("txtun");
		String pass = request.getParameter("txtpass");
		if (un.equals("abc"))//Neu dung thi mo trang docbao.vn
			response.sendRedirect("http://docbao.vn");
		else{
			String err = "Đăng nhập sai";
			request.setAttribute("err", err);
			request.getRequestDispatcher("dangnhap.jsp").forward(request, response);
		}
	%>
</body>
</html>