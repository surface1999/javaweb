package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.userBo;

@WebServlet("/sign-in")
public class signInController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("sign-in.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("id") != null && !request.getParameter("id").equals("")) {
			String id = request.getParameter("id");
			String pass = request.getParameter("pass").trim();
			String repass = request.getParameter("repass").trim();
			if (!pass.equals("")) {
				if (pass.equals(repass)) {
					userBo user = new userBo();
					try {
						user.signIn(id, pass);
						response.sendRedirect("login");
						return;
					} catch (ClassNotFoundException | SQLException e) {
						request.setAttribute("warning", new String[] { "ID đã tồn tại!" });
					}
				} else {
					request.setAttribute("warning", new String[] { "Bạn nhập lại mật khẩu chưa trùng khớp!" });
				}
			} else {
				request.setAttribute("warning", new String[] { "Bạn chưa nhập mật khẩu!" });
			}
		} else {
			request.setAttribute("warning", new String[] { "Bạn chưa nhập đầy đủ thông tin!" });
		}
		request.getRequestDispatcher("sign-in.jsp").forward(request, response);
	}

}
