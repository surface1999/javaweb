package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import Model.BEAN.DonViBean;
import Model.BEAN.NhanVienBean;
import Model.BO.DonViBo;
import Model.BO.NhanVienBo;


@WebServlet("/NhanVien")
public class NhanVienServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String add = req.getParameter("btnAdd");
		String save = req.getParameter("btnSave");
		try {
			NhanVienBo nv = new NhanVienBo();
			DonViBo dv = new DonViBo();
			if (add != null || save != null) {
				String maNV = req.getParameter("txtMNV");
				String hoTen = req.getParameter("txtHT");
				String ngaySinh = req.getParameter("txtNS");
				int gioiTinh = req.getParameter("slGT").toString().trim().equals("true") ? 1 : 0;
				float hSL = Float.parseFloat(req.getParameter("txtHSL").toString().trim());
				String maHD = req.getParameter("txtMHD");
				String maDV = req.getParameter("slMDV");
				String ghiChu = req.getParameter("txtNote");
				if (add != null) {
					nv.Them(maNV, hoTen, ngaySinh, gioiTinh, hSL, maHD, maDV, ghiChu);
				} else {
					nv.Luu(maNV, hoTen, ngaySinh, gioiTinh, hSL, maHD, maDV, ghiChu);
				}

			}
			ArrayList<NhanVienBean> listNV = new ArrayList<NhanVienBean>();
			ArrayList<DonViBean> listDV = new ArrayList<DonViBean>();
			listDV = dv.getDV();
			req.setAttribute("listDV", listDV);
			listNV = nv.AllNV();
			req.setAttribute("listNV", listNV);
			req.getRequestDispatcher("NhanVienView.jsp").forward(req, resp);

		} catch (Exception e) {
			resp.getWriter().println("Loi: " + e.getMessage());
		}
	}
}
