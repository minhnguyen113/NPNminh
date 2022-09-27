package Bai13;

import java.util.Arrays;

public class DanhSachCongNhan implements Comparable<CongNhan> {
	public CongNhan [] ls;

	int soCN;
	
	public DanhSachCongNhan( int n) {
		super();
		this.soCN = 0;
		ls = new CongNhan[n];
		soCN =0;
	}
	
	
	public CongNhan[] getLs() {
		return ls;
	}


	public void setLs(CongNhan[] ls) {
		this.ls = ls;
	}


	public int getSoCN() {
		return soCN;
	}


	public void setSoCN(int soCN) {
		this.soCN = soCN;
	}


	public boolean themCongNhan( CongNhan cn) {
		
			if(ls.length == soCN) {
				return false;
			}
			ls[soCN] = cn;
			soCN ++;
				return true;
	}
	
	public int soCN() {
		return soCN;
	}


	@Override
	public String toString() {
		String s = "DanhSachCongNhan:";
		for ( int i = 0; i < soCN ; i++) {
			s += " \n" + ls[i];
		}
		return s;
	}
	
//// hàm xóa công nhân
//	

	public boolean delete ( String k) {
		int pos = findpos(k);
		if (pos == -1)
			return false;
		for( int i = pos; i < soCN -1 ; i++) 
			ls[i] = ls[i +1]; 
		soCN -- ; // lui một phần tử
		return true;
	}
	
// hàm tìm kiếm công nhân
	
	public int findpos ( String k) {
		for (int i =0 ; i< soCN ; i ++) 
			if(ls[i].getMaCN().equals(k))
				return i;
			return -1;
		
	}
	
	// sap xep
	public void sapxep () {
		for ( int i = 0 ; i <soCN -1; i++) {
			for ( int j = i +1; j < soCN; j ++) {
				CongNhan cd = null;
				if(ls[i].getMaCN().compareToIgnoreCase(ls[i].getMaCN())> 0) {
					ls[i]= cd;
					ls[i] = ls[j];
					ls[j] = cd;
				}
			}
		}
	}


	@Override
	public int compareTo(CongNhan o) {
		// TODO Auto-generated method stub
		return 0;
	}

// phuong thuc sap xep pro
//	@Override
//	public int compareTo(CongNhan o) {
//		// TODO Auto-generated method stub
//		if ( soSp > o.soSP)
//		return 0;
//	}
	
	
	
				
	
}