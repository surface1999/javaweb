<%@page import="java.util.Calendar"%>
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Calendar n = Calendar.getInstance();
		int ngay = n.get(Calendar.DATE);
		int thang = n.get(Calendar.MONTH) + 1;//0..11
		int nam = n.get(Calendar.YEAR);
	%>
	<h5 align="right">
		Hôm nay, ngày
		<%=ngay%>
		tháng
		<%=thang%>
		năm
		<%=nam%>
	</h5>
	Chọn ngày:
	<select name="ngay">
		<%
			for (int i = 1; i <= 31; i++) {
				if (i == ngay) {
		%>
		<option selected="selected"><%=i%></option>
		<%
			}
		%>
		<option><%=i%></option>
		<%
			}
		%>
	</select> Chọn tháng:
	<select name="thang">
		<%
			for (int i = 1; i <= 12; i++) {
				if (i == thang) {
		%>
		<option selected="selected"><%=i%></option>
		<%
			}
		%>
		<option><%=i%></option>
		<%
			}
		%>
	</select> Chọn năm:
	<select name="nam">
		<%
			for (int i = nam; i >= nam - 10; i--) {
		%>
		<option <% if (i == nam) {%> selected="selected" <%}%>><%=i%></option>
		<%
			}
		%>
	</select>
	<table width="1000">
    <tr>
       <td>
          <a href="/cuuchuong/day.jsp?ts=db"> Doc bao</a> <hr>
           <a href="/cuuchuong/day.jsp?ts=bds"> bat dong san</a> <hr>
           <a href="/cuuchuong/day.jsp?ts=vc"> Vui cuoi</a> <hr>
       </td>
       <td>  
 <%
           String ts= request.getParameter("ts");
          if(ts==null)
        	  out.print("Chay lan dau");
          else{
        	  if(ts.equals("db"))
        		  out.print("ban dang xem báo");
        	  else
        		  if(ts.equals("bds"))
            		  out.print("ban dang xem tin bat dong san");
            	  else 
            		  out.print("Dang doc chuyen cuoi");
          }
        	  
          %>
       </td>
    </tr>
    </table>
</body>
</html>