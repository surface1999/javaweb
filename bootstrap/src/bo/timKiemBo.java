package bo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.SachBean;
import bo.SachBo;
import dao.timKiemDao;

public class timKiemBo {
	timKiemDao tim = new timKiemDao();
	public ArrayList<SachBean> search(String ma) throws SQLException, ClassNotFoundException {
		return tim.search(ma);
	}
	public ArrayList<SachBean> searchTen(String ten) throws SQLException, ClassNotFoundException {
		return tim.searchTen(ten);
	}
}
