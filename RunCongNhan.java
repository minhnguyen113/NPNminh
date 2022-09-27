package Bai13;

import java.util.Scanner;

public class RunCongNhan {
	static Scanner sc = new Scanner(System.in);
	
	
//	public RunCongNhan(int soCNMax) {
//		// TODO Auto-generated constructor stub
//	}

	public static String inputString(String s) {
		System.out.println(s);
		return sc.nextLine();
	}
	
	public static void main(String[] args) {
		int soCNMax = 100;
		CongNhan cn1;
		try {
			cn1 = new CongNhan("111"," Nguyen Van An",132);
			DanhSachCongNhan dscn = new DanhSachCongNhan (soCNMax);
			dscn.themCongNhan(cn1);
			CongNhan cn2 = new CongNhan ("112", " Nguyen Van Ba",130);
			dscn.themCongNhan(cn2);
			CongNhan cn3 = new CongNhan ("113", " Nguyen Van Ca",140);
			 System.out.println(dscn);
			 String mCN = inputString(" Nhap ma cong nhan can xoa:");
			 dscn.themCongNhan(cn3);
			 if( dscn.delete(mCN))
				 System.out.println("Da xoa cong nhan khoi danh sach");
			 else
				 System.out.println("Khong co ma cong nhan trong danh sach");
			System.out.println(dscn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

//		System.out.println("Danh sach cong nhan sau khi duoc sap xep" + dscn.sapxep());
		
		 
		
	}
}

