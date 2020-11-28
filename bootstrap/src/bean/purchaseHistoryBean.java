package bean;

public class purchaseHistoryBean {
	private String img;
	private String tensach;
	private int soLuong;
	private int giaBan;
	private int thanhTien;
	private int status;
	public purchaseHistoryBean(String img, String tensach, int soLuong, int giaBan,
			int status) {
		super();
		this.img = img;
		this.tensach = tensach;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
		this.thanhTien = soLuong*giaBan;
		this.status = status;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	public int getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien() {
		thanhTien = soLuong*giaBan;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	
}
