package bo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.SachBean;
import dao.SachDao;

public class SachBo {
	private SachDao sach = new SachDao() ;
	public ArrayList<SachBean> getSach() throws SQLException, ClassNotFoundException {

		return sach.getSach();
	}
	
	public ArrayList<SachBean> getSachTheoMa(String ma) throws SQLException, ClassNotFoundException {

		return sach.getSachTheoMa(ma);
	}
	
	public ArrayList<SachBean> pagination(ArrayList<SachBean> list, int page, int size){
		ArrayList<SachBean> pagination = new ArrayList<SachBean>();
		int start = (page - 1) * size;
		int end  = start + size - 1;
		int i = 0;
		for(SachBean sach : list) {
			if(i > end) {
				break;
			}
			else if(i>= start && i <= end)
				pagination.add(sach);
			i++;
		}
		return pagination;
	}

}
