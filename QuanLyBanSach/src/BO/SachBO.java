package BO;


import java.sql.SQLException;
import java.util.ArrayList;

import BEAN.SachBEAN;
import DAO.SachDAO;

public class SachBO {
	SachDAO sach = new SachDAO();
	public ArrayList<SachBEAN> getSach() throws SQLException, ClassNotFoundException {
		return sach.getSach();
	}
	
	public ArrayList<SachBEAN> pagination(ArrayList<SachBEAN> list, int page, int size){
		ArrayList<SachBEAN> pagination = new ArrayList<SachBEAN>();
		int start = (page - 1) * size;
		int end  = start + size - 1;
		int i = 0;
		for(SachBEAN sach : list) {
			if(i > end) {
				break;
			}
			else if(i>= start && i <= end)
				pagination.add(sach);
			i++;
		}
		return pagination;
	}
	public SachBEAN getSachTheoMa(String ms) throws ClassNotFoundException, SQLException {
		return sach.getSachTheoMa(ms);
		 
	}
	
	public ArrayList<SachBEAN> getTheoChuDe(String maCD) throws SQLException, ClassNotFoundException {
		return sach.getTheoChuDe(maCD);
	}
	
	public ArrayList<SachBEAN> getTheoNXB(String maNXB) throws SQLException, ClassNotFoundException {
		return sach.getTheoNXB(maNXB);
	}

}
