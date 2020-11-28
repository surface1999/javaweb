package bo;

import java.sql.SQLException;

import dao.userDao;

public class userBo {
	userDao user = new userDao();
	public int checkData(String id, String pass) {
		return user.checkData(id, pass);
	}
	
	public String[] login(String id, String pass) throws ClassNotFoundException, SQLException {
		return user.login(id, pass);
	}
	
	public void signIn(String id, String pass) throws ClassNotFoundException, SQLException {
		user.signIn(id, pass);
	}

}
