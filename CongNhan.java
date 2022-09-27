package Bai13;

public class CongNhan {
	private String maCN;
	private String ten;
	private int soSP;
	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CongNhan(String maCN, String ten, int soSP) throws Exception {
		super();
		this.maCN = maCN;
		this.ten = ten;
		setSoSP(soSP);
	}
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) throws Exception {
		if( soSP >= 0) 
		this.soSP = soSP;
		else throw new Exception(" loi!");
	}
	
	public double tinhLuong() {
		if(soSP < 200 && soSP > 0) {
			return soSP * 0.5;
		}else if(soSP <400) {
			return 100 + ( soSP - 200) *0.55;
		}else if ( soSP < 600) {
			return 100 + 110 + (soSP - 400) *0.6;
		}else {
			return 100 + 110 + 120 + ( soSP - 600) * 0.65;
		}
	}
	@Override
	public String toString() {
		return "CongNhan [maCN=" + maCN + ", ten=" + ten + ", soSP=" + soSP + ", tinhLuong()=" + tinhLuong() + "]";
	}
	
	
	
	
	
}
