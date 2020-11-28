package BEAN;

public class SachBEAN {
	String maSach;
	String tenSach;
	long giaBan;
	String moTa;
	String anhBia;
	String tacGia;
	int soLuongTon;
	String tenCD;
	String tenNXB;
	public SachBEAN(String maSach, String tenSach, long giaBan, String moTa, String anhBia, String tacGia,
			int soLuongTon, String tenCD, String tenNXB) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.moTa = moTa;
		this.anhBia = anhBia;
		this.tacGia = tacGia;
		this.soLuongTon = soLuongTon;
		this.tenCD = tenCD;
		this.tenNXB = tenNXB;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public long getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getAnhBia() {
		return anhBia;
	}
	public void setAnhBia(String anhBia) {
		this.anhBia = anhBia;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public String getTenCD() {
		return tenCD;
	}
	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	
}
