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

import bean.SachBean;
import bean.loaiBean;
import bo.SachBo;
import bo.loaiBo;
import bo.timKiemBo;

@WebServlet("/search")
public class timKiemController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String key = request.getParameter("key");
		loaiBo loai = new loaiBo();
		SachBo sach = new SachBo();
		timKiemBo tim = new timKiemBo();
		ArrayList<loaiBean> listLoai = new ArrayList<loaiBean>();
		ArrayList<SachBean> listSach = new ArrayList<SachBean>();
		String id = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("id")) {
					id = cookie.getValue();
				}
			}
		}
		try {
			listLoai = loai.getLoai();
			request.setAttribute("listLoai", listLoai);
			request.setAttribute("id", id);
			listSach = tim.searchTen(key);
			if (listSach.size() > 0) {
				int size = listSach.size();
				int page = 1;
				int countPage = size / 3;
				if (size % 3 != 0)
					countPage++;
				if (request.getParameter("page") != null) {
					page = Integer.parseInt(request.getParameter("page"));
				}
				request.setAttribute("listSach", sach.pagination(listSach, page, 3));
				request.setAttribute("page", page);
				request.setAttribute("countItems", listSach.size());
				request.setAttribute("loai", "tk");
				request.setAttribute("countPage", countPage);
				request.setAttribute("key", key);
			}
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (SQLException e) {
			response.getWriter().println("Loi: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}