package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BEAN.SachBEAN;
import BEAN.nxbBEAN;
import General.General;

public class nxbDAO {
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
	
	public ArrayList<nxbBEAN> getNXB() throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = " select * from NHAXUATBAN";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		ArrayList<nxbBEAN> listNXB = new ArrayList<nxbBEAN>();
		while (kq.next()) {
			String maNXB = kq.getString(1);
			String tenNXB  =kq.getString(2);
			String diaChi = kq.getString(3);
			String SDT = kq.getString(4);
			nxbBEAN nxb = new  nxbBEAN(maNXB, tenNXB, diaChi, SDT);
			listNXB.add(nxb);
		}

		return listNXB;
	}

}
