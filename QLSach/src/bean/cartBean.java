package bean;

public class cartBean
{
	private String anh;
	private String ms;
	private String th;
	private int gia;
	private int soLuong;
	private int thanhTien;
	public cartBean(String anh, String ms, String th, int gia, int soLuong) {
		super();
		this.anh = anh;
		this.ms = ms;
		this.th = th;
		this.gia = gia;
		this.soLuong = soLuong;
		this.thanhTien = gia * soLuong;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getTh() {
		return th;
	}
	public void setTh(String th) {
		this.th = th;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}

	
	
}
