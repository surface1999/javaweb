package BO;

import java.sql.SQLException;
import java.util.ArrayList;

import BEAN.nxbBEAN;
import DAO.nxbDAO;

public class nxbBO {
	nxbDAO nxb = new nxbDAO();
	public ArrayList<nxbBEAN> getNXB() throws SQLException, ClassNotFoundException {
		return nxb.getNXB();
	}
}
