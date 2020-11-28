package Model.BO;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Model.BEAN.NhanVienBean;
import Model.DAO.NhanVienDAO;

public class NhanVienBo {
	NhanVienDAO nv = new NhanVienDAO();

	public ArrayList<NhanVienBean> AllNV() throws ClassNotFoundException, SQLException {
		return nv.AllNV();
	}

	public ArrayList<NhanVienBean> TimNVTheoMa(String ma) throws ClassNotFoundException, SQLException {
		return nv.TimNVTheoMa(ma);
	}

	public int Them(String maNV, String hoTen, String ngaySinh, int gioiTinh, float hSL, String maHD, String maDV,
			String ghiChu) throws ClassNotFoundException, ParseException, SQLException {
		return nv.Them(maNV, hoTen, ngaySinh, gioiTinh, hSL, maHD, maDV, ghiChu);
	}
	public int Luu(String maNV, String hoTen, String ngaySinh, int gioiTinh, float hSL, String maHD, String maDV,
			String ghiChu) throws ClassNotFoundException, ParseException, SQLException {
		return nv.Luu(maNV, hoTen, ngaySinh, gioiTinh, hSL, maHD, maDV, ghiChu);
	}
	
	public int Xoa(String maNV) throws ClassNotFoundException, SQLException{
		return nv.Xoa(maNV);
	} 
}
