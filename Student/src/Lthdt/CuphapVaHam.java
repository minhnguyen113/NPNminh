package Lthdt;

public class CuphapVaHam {
	// Khai báo thuộc tính
   private String maSV;
   private String hoTenSV;
   public double tongDiem;
   
   // TÍnh chất đóng gói
   /* Dùng 2 phương thức là GET và SET kết hợp với các phương thức truy cập*/
   public  String getMaSV() {
	   return maSV;
   }
   public void setMaSV(String maSV) {
	   this.maSV=maSV;
   }
   
   public CuphapVaHam() { // Hàm tạo không tham số (constructor)
		
	}
	
	public CuphapVaHam (String maSV) { // Hàm tạo có tham số
		this.maSV =maSV;
	}
	public  CuphapVaHam (String maSV, String hotenSV) {
		this.maSV= maSV;
		this.hoTenSV= hotenSV;
	}
	
	public CuphapVaHam(String  maSV, String hotenSV, double tongDiem) {
		this.maSV= maSV;
		this.hoTenSV= hotenSV;
		this.tongDiem=tongDiem;
	}
}
