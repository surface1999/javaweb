package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.billBean;
import bean.purchaseHistoryBean;
import bo.payBo;


@WebServlet("/history")
public class historyController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("userID") != null) {
			payBo pay = new payBo();
			try {
				String userID = request.getParameter("userID");
				ArrayList<billBean> history = pay.getHistory(userID);
				request.setAttribute("id", userID);
				request.setAttribute("history", history);
				
			} catch (ClassNotFoundException | SQLException e) {
				response.getWriter().println("Loi: " + e.getMessage());
			}
			
		}
		request.getRequestDispatcher("history.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
