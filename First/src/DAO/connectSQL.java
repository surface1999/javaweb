package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import General.general;

public class connectSQL {

	public void KetNoi() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection cn = DriverManager.getConnection(general.url, general.un, general.pass);
		System.out.println("success");
	}
	public static void main(String[] args) {
		connectSQL a = new connectSQL();
		try {
			a.KetNoi();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
