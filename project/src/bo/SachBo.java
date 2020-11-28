package bo;

import java.util.ArrayList;

import bean.SachBean;
import dao.SachDao;

public class SachBo {
	private SachDao sach = new SachDao() ;
	public ArrayList<SachBean> getSach() {
		return sach.getSach();
	}

}
