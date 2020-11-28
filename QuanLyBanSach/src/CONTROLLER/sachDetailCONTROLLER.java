package CONTROLLER;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.CDBEAN;
import BEAN.SachBEAN;
import BEAN.nxbBEAN;
import BO.CDBO;
import BO.SachBO;
import BO.nxbBO;


@WebServlet("/Details")
public class sachDetailCONTROLLER extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SachBO sachB  = new SachBO();
		CDBO cd = new CDBO();
		nxbBO nxb = new nxbBO();
		ArrayList<CDBEAN> listCD;
		ArrayList<nxbBEAN> listNXB;
		if(request.getParameter("ms") != null) {
			try {
				String ms = (String) request.getParameter("ms");
				listCD = cd.getCD();
				listNXB = nxb.getNXB();
				SachBEAN sach = sachB.getSachTheoMa(ms);
				request.setAttribute("sach", sach);
				request.setAttribute("listCD", listCD);
				request.setAttribute("listNXB", listNXB);
				request.getRequestDispatcher("ChiTietSach.jsp").forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				response.getWriter().println("Loi: " + e.getMessage());
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
