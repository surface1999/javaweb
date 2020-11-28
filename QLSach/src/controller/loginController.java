package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.userBo;

@WebServlet("/login")
public class loginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		int err = 0;
		if (id == null && pass == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		} else {
			userBo user = new userBo();
			switch (user.checkData(id, pass)) {
			case 0:
				request.setAttribute("warning", new String[] { "Bạn chưa nhập id", "Bạn chưa nhập password" });
				err = 1;
				break;
			case -1:
				request.setAttribute("warning", new String[] { "Bạn chưa nhập id" });
				err = 1;
				break;
			case -2:
				request.setAttribute("warning", new String[] { "Bạn chưa nhập password" });
				err = 1;
				break;
			default:
				try {
					String[] warning = user.login(id, pass);
					if (!warning[0].equals("1")) {
						err = 1;
						request.setAttribute("warning", new String[] { warning[1] });
					} else {
						Cookie userId = new Cookie("id", warning[1]);
						response.addCookie(userId);
					}

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
		if (err == 1) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			response.sendRedirect("home");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
