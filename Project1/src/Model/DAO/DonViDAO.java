package Model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import General.General;
import Model.BEAN.DonViBean;
import Model.BEAN.NhanVienBean;

public class DonViDAO {
	Connection cn;

	public void ConnectSQL() throws ClassNotFoundException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn = DriverManager.getConnection(General.url,  General.user, General.pass);
			System.out.println("Asccess Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
	}

	public ArrayList<DonViBean> getDV() throws ClassNotFoundException, SQLException {
		ConnectSQL();
		String sql = "SELECT * FROM DonVi";
		PreparedStatement cmd = cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		ArrayList<DonViBean> list = new ArrayList<DonViBean>();
		while (rs.next()) {
			String maDv = rs.getString(1);
			String tenDV = rs.getString(2);
			DonViBean a = new DonViBean(maDv, tenDV);
			list.add(a);
		}
		return list;
	}
	public static void main(String[] args) throws ClassNotFoundException {
		DonViDAO a = new DonViDAO();
		a.ConnectSQL();
	}
}
