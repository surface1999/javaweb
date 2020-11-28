package Model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import General.*;
import Model.BEAN.NhanVienBean;

public class NhanVienDAO {
	Connection cn;

	public void ConnectSQL() throws ClassNotFoundException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn = DriverManager.getConnection(General.url, General.user, General.pass);
			System.out.println("Asccess Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
	}

	public ArrayList<NhanVienBean> AllNV() throws ClassNotFoundException, SQLException {
		ConnectSQL();
		String sql = "SELECT * FROM NhanVien";
		PreparedStatement cmd = cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		ArrayList<NhanVienBean> list = new ArrayList<NhanVienBean>();
		while (rs.next()) {
			String maNV = rs.getString(1);
			String hoTen = rs.getString(2);
			Date ngaySinh = rs.getDate(3);
			boolean gioiTinh = rs.getBoolean(4);
			float hSL = rs.getFloat(5);
			String maHD = rs.getString(6);
			String maDV = rs.getString(7);
			String ghiChu = rs.getString(8);
			NhanVienBean a = new NhanVienBean(maNV, hoTen, ngaySinh, gioiTinh, hSL, maHD, maDV, ghiChu);
			list.add(a);
		}
		return list;
	}

	public ArrayList<NhanVienBean> TimNVTheoMa(String ma) throws ClassNotFoundException, SQLException {
		ConnectSQL();
		String sql = String.format("SELECT * FROM NhanVien where Manv = '%s'", ma);
		PreparedStatement cmd = cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		ArrayList<NhanVienBean> list = new ArrayList<NhanVienBean>();
		while (rs.next()) {
			String maNV = rs.getString(1);
			String hoTen = rs.getString(2);
			Date ngaySinh = rs.getDate(3);
			boolean gioiTinh = rs.getBoolean(4);
			float hSL = rs.getFloat(5);
			String maHD = rs.getString(6);
			String maDV = rs.getString(7);
			String ghiChu = rs.getString(8);
			NhanVienBean a = new NhanVienBean(maNV, hoTen, ngaySinh, gioiTinh, hSL, maHD, maDV, ghiChu);
			list.add(a);
		}
		return list;
	}
	
	public int Them(String maNV, String hoTen, String ngaySinh, int gioiTinh, float hSL, String maHD, String maDV,
			String ghiChu) throws ClassNotFoundException, ParseException, SQLException {
		ConnectSQL();
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dateJava = fm.parse(ngaySinh);
		Date dateSql = new Date(dateJava.getTime());
		String sql = String.format("INSERT INTO NhanVien VALUES( '%s', N'%s', '%s', '%s', '%s', '%s', '%s', N'%s')", 
														maNV, hoTen, dateSql, gioiTinh, hSL, maHD, maDV, ghiChu);
		PreparedStatement cmd = cn.prepareStatement(sql);
		int kq = cmd.executeUpdate();
		cmd.close();
		return kq;
	}

	public int Luu(String maNV, String hoTen, String ngaySinh, int gioiTinh, float hSL, String maHD, String maDV,
			String ghiChu) throws ClassNotFoundException, ParseException, SQLException {
		ConnectSQL();
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dateJava = fm.parse(ngaySinh);
		Date dateSql = new Date(dateJava.getTime());
		String sql = String.format("UPDATE NhanVien SET  HoTen = N'%s', NgaySinh = '%s', GioiTinh = '%s', Hsl = '%s', MaHd = '%s', Madv = '%s', Ghichu = N'%s' WHERE Manv = '%s'", 
														hoTen, dateSql, gioiTinh, hSL, maHD, maDV, ghiChu, maNV );
		PreparedStatement cmd = cn.prepareStatement(sql);
		int kq = cmd.executeUpdate();
		cmd.close();
		return kq;
	}
	
	public int Xoa(String maNV) throws ClassNotFoundException, SQLException{
		ConnectSQL();
		String sql = String.format("DELETE FROM NhanVien WHERE Manv = '%s'", maNV);
		PreparedStatement cmd = cn.prepareStatement(sql);
		int kq = cmd.executeUpdate();
		cmd.close();
		return kq;
	} 
}
