<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
		<tr>
			<%for(int i=1; i<=10; i++){%>
				<td>
					<p>Bảng cửu chương <%= i %></p>
				</td>
			<%} %>
		</tr>
		<%for(int i=1; i<=10; i++){%>
			<tr>
				<% for(int j=1; j<=10; j++){%>
					<td>
						<p><%=j %> x <%=i %> = <%=i*j %></p>
					</td>
			<%	}%>
			</tr>
		<% }%>
	</table>
</body>
</html>