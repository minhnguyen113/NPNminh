package Lthdt;

public class giaTriXe {
	private String chuXe;
	private String loaiXe;
	private float triGiaXe;
	private int xyLanh;
	
	public giaTriXe() {
		
	}
	public giaTriXe(String chuXe, String loaiXe, float triGiaXe, int xyLanh) {
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.triGiaXe = triGiaXe;
		this.xyLanh = xyLanh;
	}
	
	public String chuXe() {
		return chuXe;
	}
	
	public void chuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	
	public String loaiXe() {
		return loaiXe;
	}
	
	public void loaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	
	public float triGiaXe() {
		return triGiaXe;
	}
	
	public void triGiaXe( float triGiaXe) {
		if( triGiaXe >= 0) {
			this.triGiaXe = triGiaXe;
		}else {
			this. triGiaXe = 0;
		}
	}
	
	public int xyLanh() {
		return xyLanh;
	}
	
	public void xyLanh(int xyLanh) {
		if(xyLanh >= 0) {
			this.xyLanh =xyLanh;
		}else {
			this.xyLanh =0;
		}
	}
	
	public float thue() {
		if(xyLanh < 100) {
			return (float) (triGiaXe *0.01);
		}else if( xyLanh >=100 && xyLanh <200) {
			return (float) ( triGiaXe * 0.03);
		}else {
			return (float) (triGiaXe *0.05);
		}
//		return triGiaXe;
	}
	
	
}
