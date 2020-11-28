package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import General.General;
import bean.SachBean;
import bean.loaiBean;

public class SachDao {
	public Connection cn;

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

	public ArrayList<SachBean> getSach() throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = "SELECT * FROM Sach";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		ArrayList<SachBean> listSach = new ArrayList<SachBean>();
		while (kq.next()) {
			String masach = kq.getString(1);
			String tensach = kq.getString(2);
			String tacgia = kq.getString(3);
			int gia = kq.getInt(4);
			String anh = kq.getString(5);
			String maloai = kq.getString(6);
			SachBean sach = new SachBean(masach, tensach, tacgia, gia, anh, maloai);
			listSach.add(sach);
		}

		return listSach;
	}
	
	public ArrayList<SachBean> getSachTheoMa(String ma) throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = "SELECT * FROM Sach WHERE maLoai='" + ma + "'";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		ArrayList<SachBean> listSach = new ArrayList<SachBean>();
		while (kq.next()) {
			String masach = kq.getString(1);
			String tensach = kq.getString(2);
			String tacgia = kq.getString(3);
			int gia = kq.getInt(4);
			String anh = kq.getString(5);
			String maloai = kq.getString(6);
			SachBean sach = new SachBean(masach, tensach, tacgia, gia, anh, maloai);
			listSach.add(sach);
		}
		return listSach;
	}
	
	public SachBean TimSachTheoMa(String ma) throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = "SELECT * FROM Sach WHERE maSach='" + ma + "'";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		while (kq.next()) {
			String masach = kq.getString(1);
			String tensach = kq.getString(2);
			String tacgia = kq.getString(3);
			int gia = kq.getInt(4);
			String anh = kq.getString(5);
			String maloai = kq.getString(6);
			SachBean sach = new SachBean(masach, tensach, tacgia, gia, anh, maloai);
			return sach;
		}
		return null;
	}
	
}
