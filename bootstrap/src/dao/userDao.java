package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import General.General;

public class userDao {
	public Connection cn;

	public void connectSQL() throws ClassNotFoundException {
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

	public int checkData(String id, String pass) {
		if (id.equals("")) {
			if (pass.equals(""))
				return 0;
			else
				return -1;
		} else {
			if (pass.equals(""))
				return -2;
			else
				return 1;
		}

	}
	
	public String[] login(String id, String pass) throws ClassNotFoundException, SQLException {
		connectSQL();
		String sql = "SELECT * FROM users WHERE id='" + id + "'";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet users = cm.executeQuery();
		int i = 0;
		while(users.next()) {
			i++;
			if(users.getString(2).trim().equals(pass))
				return new String[] {"1", id, pass};
		}
		if(i != 0) {
			return new String[] {"-1", "Mật khẩu không chính xác!"};
		}
		return new String[] {"0", "User không tồn tại"};
	}
	
	public void signIn(String id, String pass) throws ClassNotFoundException, SQLException {
		connectSQL();
		String sql = "INSERT INTO users VALUES('" + id+ "', '" + pass + "')";
		PreparedStatement cm = cn.prepareStatement(sql);
		cm.executeUpdate();
		System.out.println("Add Account sucessful!");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		userDao a = new userDao();
		System.out.println(a.login("surface1989", "210899")[1]);
	}
}
