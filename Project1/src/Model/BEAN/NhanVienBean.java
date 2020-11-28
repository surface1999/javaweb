package Model.BEAN;

import java.sql.Date;

public class NhanVienBean {
	String MaNV;
	String HoTen;
	Date NgaySinh;
	boolean GioiTinh;
	float HSL;
	String MaHD;
	String MaDV;
	String GhiChu;
	public NhanVienBean(String maNV, String hoTen, Date ngaySinh, boolean gioiTinh, float hSL, String maHD, String maDV,
			String ghiChu) {
		super();
		MaNV = maNV;
		HoTen = hoTen;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		HSL = hSL;
		MaHD = maHD;
		MaDV = maDV;
		GhiChu = ghiChu;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public boolean isGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public float getHSL() {
		return HSL;
	}
	public void setHSL(float hSL) {
		HSL = hSL;
	}
	public String getMaHD() {
		return MaHD;
	}
	public void setMaHD(String maHD) {
		MaHD = maHD;
	}
	public String getMaDV() {
		return MaDV;
	}
	public void setMaDV(String maDV) {
		MaDV = maDV;
	}
	public String getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	
}
