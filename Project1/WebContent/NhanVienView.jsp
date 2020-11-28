<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Model.BEAN.NhanVienBean"%>
<%@page import="Model.BO.NhanVienBo"%>
<%@page import="Model.BO.DonViBo"%>
<%@page import="Model.BEAN.DonViBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Quản lý nhân viên</title>
</head>
<body>
	<form action="NhanVien" method="get">
	<%ArrayList<NhanVienBean> nv1 = new ArrayList<NhanVienBean>();
		String day = "";
		if(request.getAttribute("nv") != null){
			nv1 = (ArrayList<NhanVienBean>)request.getAttribute("nv");
			SimpleDateFormat ft =  new SimpleDateFormat ("yyyy-MM-dd");
			day = ft.format(nv1.get(0).getNgaySinh());
		}
	 %>
	 <a href="NhanVien">Trang chủ</a>
		<table cellspacing="10">
			<tr>
				<td>Mã nhân viên:</td>
				<td><input type="text" name="txtMNV" <%if(nv1.size()>0){%> value="<%=nv1.get(0).getMaNV()%>" <%}%>></td>
			</tr>
			<tr>
				<td>Họ tên:</td>
				<td><input type="text" name="txtHT" <%if(nv1.size()>0){%>value="<%=nv1.get(0).getHoTen()%>"<%}%>></td>
			</tr>
			<tr>
				<td>Ngày sinh:</td>
				<td><input type="date" style="width: 96%;" name="txtNS"  value="<%=day%>"></td>
			</tr>
			<tr>
				<td>Giới tính:</td>
				<td>
					<select name="slGT" style="width: 100%; padding: 3px 0;">
						<option value=true <%if(nv1.size()>0){%><%if(nv1.get(0).isGioiTinh()){ %> selected="selected" <%}%><%}%>>Nam</option>
						<option value=false <%if(nv1.size()>0){%><%if(!nv1.get(0).isGioiTinh()){ %> selected="selected" <%}%><%}%>>Nữ</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>HSL:</td>
				<td><input type="text" name="txtHSL" <%if(nv1.size()>0){%>value="<%=nv1.get(0).getHSL()%>"<%}%>></td>
			</tr>
			<tr>
				<td>Mã HD:</td>
				<td><input type="text" name="txtMHD" <%if(nv1.size()>0){%>value="<%=nv1.get(0).getMaHD()%>"<%}%>></td>
			</tr>
			<tr>
				<td>Mã dịch vụ:</td>
				<td>
					<select name="slMDV" style="width: 100%; padding: 3px 0">
					<% ArrayList<DonViBean> listDV = new ArrayList<DonViBean>();
						listDV =(ArrayList<DonViBean> ) request.getAttribute("listDV");
						for(DonViBean dv : listDV){%>
						<option  value=<%=dv.getMaDv()%> <%if(nv1.size()>0){%><%if(nv1.get(0).getMaDV().equals(dv.getMaDv())){ %> selected="selected" <%}%> <%}%>><%=dv.getTenDV()%></option>
					<%} %>

					</select>
				</td>
			</tr>
			<tr>
				<td>Ghi chú:</td>
				<td><textarea style="width: 96%;" name="txtNote"><%if(nv1.size()>0){%><%=nv1.get(0).getGhiChu()%><%}%></textarea></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="submit" name="btnAdd" value="Thêm"> &emsp;&emsp;
					<input type="submit" name="btnSave" value="Lưu">
				</td>
			</tr>
		</table>
		
		<table border="1" cellspacing="0">
				<%
					ArrayList<NhanVienBean> listNV = new ArrayList<NhanVienBean>();
					listNV =(ArrayList<NhanVienBean> ) request.getAttribute("listNV");
					if(listNV.size() > 0){%>
						<tr>
							<th>Mã nhân viên</th>
							<th>Họ và tên</th>
							<th>Ngày sinh</th>
							<th>Mã dịch vụ</th>
							<th>Mã hóa đơn</th>
							<th>Ghi chú</th>
							<th>Chức năng</th>
						</tr>
						<%for(NhanVienBean nv : listNV){%>
							<tr>
								<td><%=nv.getMaNV() %></td>
								<td><%=nv.getHoTen() %></td>
								<td><%=nv.getNgaySinh() %></td>
								<td><%=nv.getMaDV() %></td>
								<td><%=nv.getMaHD() %></td>
								<td><%=nv.getGhiChu() %></td>
								<td>
									<a href="select?mnv=<%=nv.getMaNV()%>">Sửa</a>&nbsp;
									<a href="delete?mnv=<%=nv.getMaNV()%>">Xóa</a>
								</td>
							</tr>
				<%	}
				}%>
		</table>
	</form>
</body>
</html>