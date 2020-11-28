package bean;

import java.util.ArrayList;

public class billBean {
	private String date, orderID;
	private ArrayList<purchaseHistoryBean> listItem;
	private int TongSL;
	private int TongTien;
	public billBean(String date, String orderID, ArrayList<purchaseHistoryBean> listItem, int tongSL, int tongTien) {
		super();
		this.date = date;
		this.orderID = orderID;
		this.listItem = listItem;
		TongSL = tongSL;
		TongTien = tongTien;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public ArrayList<purchaseHistoryBean> getListItem() {
		return listItem;
	}
	public void setListItem(ArrayList<purchaseHistoryBean> listItem) {
		this.listItem = listItem;
	}
	public int getTongSL() {
		return TongSL;
	}
	public void setTongSL(int tongSL) {
		TongSL = tongSL;
	}
	public int getTongTien() {
		return TongTien;
	}
	public void setTongTien(int tongTien) {
		TongTien = tongTien;
	}


}
