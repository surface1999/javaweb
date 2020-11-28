<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String N = request.getParameter("n");
		long n = 0, sum = 0;
		if(N != null){
			n = Long.parseLong(N);
		}
		String s = session.getAttribute("s").toString();
		if(s == null){
			session.setAttribute("s", "0");
			s = String.valueOf(N);
		}
		else{
			sum = Long.parseLong(s) + n;
		}
		session.setAttribute("s", s);

	%>
	<form action="vd1.jsp">
		n = : <input type="text" name="n" <%if(N != null){%> value=<%=N %> <%}%>>
		<input type="submit" name="btn" value="Tính">
	</form>
	<h5>Result: <%=s %></h5>

</body>
</html>