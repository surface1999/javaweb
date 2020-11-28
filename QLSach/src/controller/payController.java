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

import bean.cartBean;
import bo.cartBo;


@WebServlet("/pay")
public class payController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("userID") == null)
			request.getRequestDispatcher("login").forward(request, response);
		else {
			HttpSession session = request.getSession();
			cartBo cart = (cartBo)session.getAttribute("carts");
			try {
				String userID = request.getParameter("userID").trim();
				cart.pay(userID);
				cart.setListCart(new ArrayList<cartBean>());
				session.setAttribute("carts", cart);
			} catch (ClassNotFoundException e) {
				response.getWriter().println("Loi: " + e.getMessage());
				return;
			} catch (SQLException e) {
				response.getWriter().println("Loi: " + e.getMessage());
				return;
			}
			request.getRequestDispatcher("listcart").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
