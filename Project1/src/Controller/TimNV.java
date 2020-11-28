package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BEAN.DonViBean;
import Model.BEAN.NhanVienBean;
import Model.BO.DonViBo;
import Model.BO.NhanVienBo;


@WebServlet("/select")
public class TimNV extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			String maNV = request.getParameter("mnv").toString();
			NhanVienBo nvb = new NhanVienBo();
			DonViBo dv = new DonViBo();
			ArrayList<NhanVienBean> result =(ArrayList<NhanVienBean> )nvb.TimNVTheoMa(maNV);
			request.setAttribute("nv", result);
			ArrayList<NhanVienBean> listNV = new ArrayList<NhanVienBean>();
			ArrayList<DonViBean> listDV = new ArrayList<DonViBean>();
			listDV = dv.getDV();
			request.setAttribute("listDV", listDV);
			listNV = nvb.AllNV();
			request.setAttribute("listNV", listNV);
			request.getRequestDispatcher("NhanVienView.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
