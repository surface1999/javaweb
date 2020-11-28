package dao;

import java.util.ArrayList;

import bean.SachBean;

public class SachDao {
	public ArrayList<SachBean> getSach() {
		ArrayList<SachBean> list = new  ArrayList<SachBean>();
		list.add(new SachBean("s1", "De men phieu luu ky", "Truong Minh Duc", 500000, "photo/b1.jpg", "tin"));
		list.add(new SachBean("s2", "De men phieu luu ky", "Truong Minh Duc", 500000, "photo/b2.jpg", "tin"));
		list.add(new SachBean("s3", "De men phieu luu ky", "Truong Minh Duc", 500000, "photo/b3.jpg", "tin"));
		list.add(new SachBean("s4", "De men phieu luu ky", "Truong Minh Duc", 500000, "photo/b4.jpg", "tin"));
		list.add(new SachBean("s5", "De men phieu luu ky", "Truong Minh Duc", 500000, "photo/b5.jpg", "tin"));
		return list;
	}
}
