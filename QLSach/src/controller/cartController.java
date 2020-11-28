package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.SachBean;
import bean.cartBean;
import bo.cartBo;
import func.funct;

@WebServlet("/cart")
public class cartController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String maSach = request.getParameter("ms");
		String c = request.getParameter("c");
		if (session.getAttribute("carts") == null) {
			cartBo carts = new cartBo();
			session.setAttribute("carts", carts);
		}
		cartBo listCart = (cartBo) session.getAttribute("carts");
		switch (c) {
		case "t":
			try {
				listCart.TangSL(maSach);
				session.setAttribute("carts", listCart);
				response.sendRedirect("listcart");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case "g":
			try {
				listCart.GiamSl(maSach);
				session.setAttribute("carts", listCart);
				response.sendRedirect("listcart");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "x":
			try {
				listCart.Xoa(maSach);
				session.setAttribute("carts", listCart);
				response.sendRedirect("listcart");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:
			try {
				listCart.Them(maSach);
				session.setAttribute("carts", listCart);
				response.sendRedirect("home");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		cartBo carts = (cartBo) session.getAttribute("carts");
		ArrayList<cartBean> listCart = new ArrayList<cartBean>();
		for(cartBean a : carts.getListCart()) {
			listCart.add(a);
		}
		for (cartBean cart : carts.getListCart()) {
			if (request.getParameter(cart.getMs().trim()) != null) {
				listCart.remove(cart);
			}
		}
		carts.setListCart(listCart);
		session.setAttribute("carts", carts);
		response.sendRedirect("listcart");
	}

}
