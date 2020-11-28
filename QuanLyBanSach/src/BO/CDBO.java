package BO;

import java.sql.SQLException;
import java.util.ArrayList;

import BEAN.CDBEAN;
import DAO.CDDAO;

public class CDBO {
	CDDAO cd = new CDDAO();
	public ArrayList<CDBEAN> getCD() throws SQLException, ClassNotFoundException {
		return cd.getCD();
	}

}
