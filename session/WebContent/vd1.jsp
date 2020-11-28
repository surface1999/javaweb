<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String n = request.getParameter("n");

		if(session.getAttribute("s") == null){
			session.setAttribute("s", (long)0);
		}
		long N=0, sum=0;
		if(n != null){
			N = Long.parseLong(n);
			sum = Long.parseLong(session.getAttribute("s").toString());
			sum += N;
			session.setAttribute("s", sum);
		}


	%>
	<form action="vd1.jsp">
		n = : <input type="text" name="n" <%if(n != null){%> value=<%=N %> <%}%>>
		<input type="submit" name="btn" value="Tính">
	</form>
	<h5>Result:  sum=<%=sum %> </h5>

</body>
</html>