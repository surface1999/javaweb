<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.jsp" method="post">
	<table>
		<tr>
			<td>Username:</td>
			<td><input type="text" name="user"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="text" name="pass"></td>
		</tr>
	</table>
		&emsp;<input type="submit" name="btn" value="Đăng nhập"><br>
	</form>
	<%
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		if(user == null || user.equals("") ){%>
			<h5>Mời bạn đăng nhập</h5>
		<% }
		else{
			session.setAttribute("name", user);
			response.sendRedirect("t1.jsp");
			
	} %>

</body>
</html>