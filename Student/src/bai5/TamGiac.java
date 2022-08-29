package bai5;

public class TamGiac {
	
	private int ma;
	private int mb;
	private int mc;
	public TamGiac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TamGiac(int ma, int mb, int mc) {
		super();
		if( ma < 0 && mb < 0 && mc <0) {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}else {
			this.ma =ma;
			this.mb = mb;
			this.mc =mc;									
		}
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		if(ma >= 0) {
			this.ma = ma;
		}else {
			this.ma = 0;
		}
	}
	public int getMb() {
			return mb;
	}
	public void setMb(int mb) {
		if(mb >= 0) {
			this.mb = mb;
		}else {
			this.mb = 0;
		}
	}
	public int getMc() {
		return mc;
	}
	public void setMc(int mc) {
		if ( mc >= 0 ) {
			this.mc = mc;
		}else {
			this.mc = 0;
		}
	}
	
	public float ChuVi () {
		return (float)(ma + mb + mc) / 2;
		
	}
	
	public  float DienTich() {
		float p =(ma + mb + mc) / 2;
		float sd;
		sd =(float)Math.sqrt( p*(p-ma)*(p-mb)*(p-mc));
		return sd;
	}
	
	public String display() {
		if(ma < 0 && mb <0 && mc <0) {
			return "Khong phai la tam giac";
		}
		else if((ma == mb) && (mb == mc)) {
			return "Tam giac deu";
		}
		else if((ma==mb) || (mc == mb) || (ma == mc)) {
			return "Tam giac can";
		}
		else {
			return " Tam giac thuong";
		}
		
	}	
	@Override
	public String toString() {
		String s="";
		s=s.format("%5s %5s %5s %30s %10.2f %10.2f",ma,mb,mc,display(),ChuVi(), DienTich());
		return s;
	}
	
	
	
	
}
