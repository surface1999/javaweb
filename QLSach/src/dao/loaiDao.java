package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import General.General;
import bean.loaiBean;

public class loaiDao {
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

	public ArrayList<loaiBean> getLoai() throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = "SELECT * FROM loaiSach";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		ArrayList<loaiBean> listLoai = new ArrayList<loaiBean>();
		while (kq.next()) {
			String maLoai = kq.getString(1);
			String tenLoai = kq.getString(2);
			loaiBean loai = new loaiBean(maLoai, tenLoai);
			listLoai.add(loai);
		}

		return listLoai;
	}
	
}
