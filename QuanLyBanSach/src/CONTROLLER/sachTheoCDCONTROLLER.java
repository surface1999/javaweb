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


@WebServlet("/SPTheochude")
public class sachTheoCDCONTROLLER extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SachBO sach = new SachBO();
		CDBO cd = new CDBO();
		nxbBO nxb = new nxbBO();
		ArrayList<SachBEAN> listSach;
		ArrayList<CDBEAN> listCD;
		ArrayList<nxbBEAN> listNXB;
		if(request.getParameter("maCD") != null) {
			String maCD = request.getParameter("maCD");
		try {
			listSach = sach.getTheoChuDe(maCD);
			listCD = cd.getCD();
			listNXB = nxb.getNXB();
			int size = listSach.size();
			int page = 1;
			int countPage = size / 6;
			if (size % 3 != 0)
				countPage++;
			if(request.getParameter("page") != null) {
				page = Integer.parseInt(request.getParameter("page"));
			}
			request.setAttribute("listSach", sach.pagination(listSach, page, 6));
			request.setAttribute("listCD", listCD);
			request.setAttribute("listNXB", listNXB);
			request.setAttribute("page", page);
			request.setAttribute("countItems", listSach.size());
			request.setAttribute("countPage", countPage);
		} catch (ClassNotFoundException e) {
			response.getWriter().println("Loi: " + e.getMessage());
			return;
		} catch (SQLException e) {
			response.getWriter().println("Loi: " + e.getMessage());
			return;
		}
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
