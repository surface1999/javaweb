<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Calculator</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<% 	String 	a = request.getParameter("txta"),
 				b = request.getParameter("txtb"),
				btn = request.getParameter("btn"),
				result = null;
		if(( a != null && b!= null) && (!a.equals("") && !b.equals(""))){
			if( !btn.equals("Reset") ){
				float kq = 0;
				float c = Float.parseFloat(a);
				float d =  Float.parseFloat(b);
				switch(btn){
					case "+": 
						kq = c + d;
						break;
					case "-": 
						kq = c - d;
						break;
					case "*": 
						kq = c * d;
						break;
					case "/":
						kq = c / d;
						break;
					default:
						break;
						
				}
				result = String.valueOf(kq);
			}
			else
				a = b = null;

		}

	%>
	<div class="calculator">
		<div align="center" class="title">
			<h3>CALCULATOR</h3>
		</div>
		<form action="calculator.jsp" method="post">
			<table cellspacing= "10">
				<tr>
					<td>Enter a: </td>
					<td><input type="text" name="txta" <%if(a != null){%> value="<%=a%>" <%} %>></td>
				</tr>
				<tr>
					<td>Enter b:</td>
					<td><input type="text" name="txtb"  <%if(b != null){%> value="<%=b%>" <%} %>></td>
				</tr>
				<tr>
					<td>Result:</td>
					<td>
						<input 	type="text" 
								name="txtResult" 
								<%if(result != null){%> 
									value="<%= a + " " + btn + " " + b + " = " + result%>" 
								<%} %>
						>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" class="btn" name="btn" value="+"> &nbsp;
						<input type="submit" class="btn" name="btn" value="-" > &nbsp;
						<input type="submit" class="btn" name="btn" value="*"> &nbsp;
						<input type="submit" class="btn" name="btn" value="/"> &nbsp;
						<input type="submit" class="btn" name="btn" value="Reset"> 
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>