package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BEAN.CDBEAN;
import BEAN.nxbBEAN;
import General.General;

public class CDDAO {
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
	
	public ArrayList<CDBEAN> getCD() throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = " select * from NHAXUATBAN";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		ArrayList<CDBEAN> listCD = new ArrayList<CDBEAN>();
		while (kq.next()) {
			String maCD = kq.getString(1);
			String tenCD = kq.getString(2);
			CDBEAN cd = new  CDBEAN(maCD, tenCD);
			listCD.add(cd);
		}

		return listCD;
	}


}
