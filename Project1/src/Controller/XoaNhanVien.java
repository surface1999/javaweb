package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.NhanVienBo;


@WebServlet("/delete")
public class XoaNhanVien extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maNV = request.getParameter("mnv");
		NhanVienBo nv = new NhanVienBo();
		try {
			nv.Xoa(maNV);
			request.getRequestDispatcher("/NhanVien").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			response.getWriter().println("Loi: " + e.getMessage());
		}
	}

}
