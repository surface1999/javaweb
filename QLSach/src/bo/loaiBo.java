package bo;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.loaiBean;
import dao.loaiDao;

public class loaiBo {
	loaiDao loai = new loaiDao();
	
	public ArrayList<loaiBean> getLoai() throws SQLException, ClassNotFoundException {
		return loai.getLoai();
	}
	

}
