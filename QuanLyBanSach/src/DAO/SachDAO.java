package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BEAN.SachBEAN;
import General.General;

public class SachDAO {
	public Connection cn;

	public void ConnectSQL() throws ClassNotFoundException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn = DriverManager.getConnection(General.url, General.user, General.pass);
			System.out.println("Asccess Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public ArrayList<SachBEAN> getSach() throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = " select s.Masach, s.Tensach, s.Giaban, s.Mota, s.Anhbia, tg.TenTG, s.Soluongton, cd.TenChuDe, nxb.TenNXB"
				 	+ " from SACH as s"
					+ " inner join CHUDE as cd on s.MaCD = cd.MaCD"
					+ " inner join NHAXUATBAN as nxb on s.MaNXB = nxb.MaNXB"
					+ " inner join VIETSACH as vs on vs.Masach = s.Masach"
					+ " inner join TACGIA as tg on vs.MaTG = tg.MaTG ";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		ArrayList<SachBEAN> listSach = new ArrayList<SachBEAN>();
		while (kq.next()) {
			String maSach = kq.getString(1);
			String tenSach = kq.getString(2);
			long giaBan = kq.getLong(3);
			String moTa = kq.getString(4);
			String anhBia = kq.getString(5);
			String tacGia = kq.getString(6);
			int soLuongTon = kq.getInt(7);
			String tenCD = kq.getString(8);
			String tenNXB = kq.getString(9);
			SachBEAN sach = new SachBEAN(maSach, tenSach, giaBan, moTa, anhBia, tacGia, soLuongTon, tenCD, tenNXB);
			listSach.add(sach);
		}

		return listSach;
	}
	
	public ArrayList<SachBEAN> getTheoChuDe(String maCD) throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = " select s.Masach, s.Tensach, s.Giaban, s.Mota, s.Anhbia, tg.TenTG, s.Soluongton, cd.TenChuDe, nxb.TenNXB"
				 	+ " from SACH as s"
					+ " inner join (select * from CHUDE where MaCD = '" +  maCD + "')as cd on s.MaCD = cd.MaCD"
					+ " inner join NHAXUATBAN as nxb on s.MaNXB = nxb.MaNXB"
					+ " inner join VIETSACH as vs on vs.Masach = s.Masach"
					+ " inner join TACGIA as tg on vs.MaTG = tg.MaTG ";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		ArrayList<SachBEAN> listSach = new ArrayList<SachBEAN>();
		while (kq.next()) {
			String maSach = kq.getString(1);
			String tenSach = kq.getString(2);
			long giaBan = kq.getLong(3);
			String moTa = kq.getString(4);
			String anhBia = kq.getString(5);
			String tacGia = kq.getString(6);
			int soLuongTon = kq.getInt(7);
			String tenCD = kq.getString(8);
			String tenNXB = kq.getString(9);
			SachBEAN sach = new SachBEAN(maSach, tenSach, giaBan, moTa, anhBia, tacGia, soLuongTon, tenCD, tenNXB);
			listSach.add(sach);
		}

		return listSach;
	}
	
	public ArrayList<SachBEAN> getTheoNXB(String maNXB) throws SQLException, ClassNotFoundException {
		ConnectSQL();
		String sql = " select s.Masach, s.Tensach, s.Giaban, s.Mota, s.Anhbia, tg.TenTG, s.Soluongton, cd.TenChuDe, nxb.TenNXB"
				 	+ " from SACH as s"
					+ " inner join CHUDE as cd on s.MaCD = cd.MaCD"
					+ " inner join (select * from NHAXUATBAN where MaNXB = '" + maNXB + "') as nxb on s.MaNXB = nxb.MaNXB"
					+ " inner join VIETSACH as vs on vs.Masach = s.Masach"
					+ " inner join TACGIA as tg on vs.MaTG = tg.MaTG ";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet kq = cm.executeQuery();
		ArrayList<SachBEAN> listSach = new ArrayList<SachBEAN>();
		while (kq.next()) {
			String maSach = kq.getString(1);
			String tenSach = kq.getString(2);
			long giaBan = kq.getLong(3);
			String moTa = kq.getString(4);
			String anhBia = kq.getString(5);
			String tacGia = kq.getString(6);
			int soLuongTon = kq.getInt(7);
			String tenCD = kq.getString(8);
			String tenNXB = kq.getString(9);
			SachBEAN sach = new SachBEAN(maSach, tenSach, giaBan, moTa, anhBia, tacGia, soLuongTon, tenCD, tenNXB);
			listSach.add(sach);
		}

		return listSach;
	}
	
	public SachBEAN getSachTheoMa(String ms) throws ClassNotFoundException, SQLException {
		ArrayList<SachBEAN> listSach = getSach();
		for(SachBEAN sach : listSach) {
			if(sach.getMaSach().trim().equals(ms.trim())) {
				return sach;
			}
		}
		return null;
		 
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SachDAO a = new SachDAO();
		a.ConnectSQL();
		System.out.println(a.getTheoNXB("1").get(0).getTenSach());
	}

}
