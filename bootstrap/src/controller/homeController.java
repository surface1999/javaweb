package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.SachBean;
import bean.loaiBean;
import bo.SachBo;
import bo.cartBo;
import bo.loaiBo;


@WebServlet("/home")
public class homeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
		 for (Cookie cookie : cookies) {
		   if (cookie.getName().equals("id")) {
			   id = cookie.getValue();
		    }
		  }
		}
		HttpSession session = request.getSession();
		loaiBo loai = new loaiBo();
		SachBo sach = new SachBo();
		ArrayList<loaiBean> listLoai = new ArrayList<loaiBean>();
		ArrayList<SachBean> listSach = new ArrayList<SachBean>();
		if(session.getAttribute("carts") == null) {
			session.setAttribute("carts", new cartBo());
		}
		
		try {
			listLoai = loai.getLoai();
			listSach = sach.getSach();
			int size = listSach.size();
			int page = 1;
			int countPage = size / 6;
			if (size % 3 != 0)
				countPage++;
			if(request.getParameter("page") != null) {
				page = Integer.parseInt(request.getParameter("page"));
			}
			request.setAttribute("listSach", sach.pagination(listSach, page, 6));
			request.setAttribute("page", page);
			request.setAttribute("countItems", listSach.size());
			request.setAttribute("countPage", countPage);
			request.setAttribute("listLoai", listLoai);
			request.setAttribute("id", id);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (SQLException e) {
			response.getWriter().println("Loi: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			response.getWriter().println("Loi: " + e.getMessage());
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}