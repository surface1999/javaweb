package Model.BEAN;

public class DonViBean {

		String MaDv;
		String TenDV;
		public DonViBean(String maDv, String tenDV) {
			super();
			MaDv = maDv;
			TenDV = tenDV;
		}
		public String getMaDv() {
			return MaDv;
		}
		public void setMaDv(String maDv) {
			MaDv = maDv;
		}
		public String getTenDV() {
			return TenDV;
		}
		public void setTenDV(String tenDV) {
			TenDV = tenDV;
		}
		

}
