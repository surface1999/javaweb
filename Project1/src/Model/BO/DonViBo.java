package Model.BO;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.BEAN.DonViBean;
import Model.DAO.DonViDAO;

public class DonViBo {
	DonViDAO dv = new DonViDAO();
	public ArrayList<DonViBean> getDV() throws ClassNotFoundException, SQLException {
		return dv.getDV();
	}

}
