package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import General.General;
import bean.billBean;
import bean.cartBean;
import bean.purchaseHistoryBean;


public class payDao {
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
    static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
	
	public void pay(String userID, ArrayList<cartBean> carts) throws ClassNotFoundException, SQLException {
		ConnectSQL();
		String orderId = payDao.getAlphaNumericString(10);
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		String date = fm.format(new Date().getTime());
		String sql1 = "INSERT INTO orders VALUES('" + orderId + "', '" + userID + "', '" + date + "')";
		PreparedStatement cm = cn.prepareStatement(sql1);
		cm.executeUpdate();
		for(cartBean cart : carts) {
			String sql2 = "INSERT INTO order_sach VALUES('" + orderId + "', '" + cart.getMs() + "', " + cart.getSoLuong() + ",0 )";
			PreparedStatement cmt = cn.prepareStatement(sql2);
			cmt.executeUpdate();
		}
		
	}
	
	public ArrayList<billBean> getHistory(String userID) throws SQLException, ClassNotFoundException{
		ConnectSQL();
		SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<purchaseHistoryBean> listItem= new ArrayList<purchaseHistoryBean>();
		ArrayList<billBean> history= new ArrayList<billBean>();
		String orderID = "", ngayLap  = "";
		int f = 0;
		String sql = 	"select o.orderID, o.ngayLap, s.img, s.tenSach, os.soLuong, s.giaBan, os.daThanhToan " + 
						"from ( select orderID, ngayLap from orders where id = '" + userID.trim() + "') as o " + 
						"inner join order_sach as os on o.orderID = os.orderID " + 
						"inner join sach as s on os.maSach = s.maSach " + 
						"order by o.orderID, o.ngayLap";
		PreparedStatement cm = cn.prepareStatement(sql);
		ResultSet items = cm.executeQuery();
		while(items.next()) {
			if((!orderID.trim().equals(items.getString(1).trim()) && !ngayLap.trim().equals(items.getString(2).trim()) && f == 1)) {
				f = 0;
				billBean item = new billBean(ngayLap, orderID, listItem, tongSL(listItem), tongThanhTien(listItem));
				history.add(item);
				listItem = new ArrayList<purchaseHistoryBean>();
			}
			if(f == 0) {
				orderID = items.getString(1);
				ngayLap = fm.format(items.getDate(2));
				f = 1;
			}
			String img = items.getString(3);
			String tenSach = items.getString(4);
			int soLuong  =items.getInt(5);
			int giaBan = items.getInt(6);
			int status = items.getInt(7);
			purchaseHistoryBean item = new purchaseHistoryBean(img, tenSach, soLuong, giaBan, status);
			listItem.add(item);	
		}
		billBean item = new billBean(ngayLap, orderID, listItem, tongSL(listItem), tongThanhTien(listItem));
		history.add(item);
		return history;
	}
	
	public int tongSL(ArrayList<purchaseHistoryBean> history) {
		int sum  = 0;
		for (purchaseHistoryBean item : history) {
			sum += item.getSoLuong();
		}
		return sum;
	}
	public int tongThanhTien(ArrayList<purchaseHistoryBean> history) {
		int money  = 0;
		for (purchaseHistoryBean item : history) {
			money += item.getSoLuong() * item.getGiaBan();
		}
		return money;
	}

}
