package Lthdt;

public class tamGiac {
	
		private int ma;
		private int mb;
		private int mc;
		
		public tamGiac() {
			
		}
		
		public tamGiac( int ma, int mb, int mc) {
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
			if(ma < 0) {
				this.ma = 0;
			}else {
				this.ma =ma;
			}
		}
		
		public int getMb() {
			return mb;
		}
		
		public void setMb(int mb) {
			if(mb < 0) {
				this.mb =0;
			}else {
				this.mb = mb;
			}
		}
		
		public int getMc() {
			return mc;
		}
		
		public void setMc(int mc) {
			if( mc < 0) {
				this.mc = 0;
			}else {
				this.mc =mc;
			}
		}
		
		public static float ChuVi (int ma, int mb, int mc) {
			return (float)(ma + mb + mc) / 2;
			
		}
		
		public static float DienTich( int ma, int mb, int mc) {
			float p =(ma + mb + mc) / 2;
			float sd;
			sd =(float)Math.sqrt( p*(p-ma)*(p-mb)*(p-mc));
			return sd;
		}
		 	
		public void display() {
			if(ma < 0 && mb <0 && mc <0) {
				System.out.println("Khong phai la tam giac");
			}
			else if((ma==mb) || (mc == mb) || (ma == mc)) {
				System.out.println("Tam giac can");
			}
			else if((ma == mb) && (mb == mc)) {
				System.out.println("Tam giac deu");
			}else {
				System.out.println(" Tam giac thuong");
			}
		}
		@Override
		public String toString() {
			return String.format("%5s %5s %5s  %10s %10.2f %10.2f",ma,mb,mc,display(), ChuVi(ma, mb, mc), DienTich(ma, mb, mc));
		}
		
		
		
	}


