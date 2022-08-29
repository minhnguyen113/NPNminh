package Test;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
	public static void main(String[] args) {
		int aNumber ,bNumber;
		double Nghiem;
		Scanner sr = new Scanner(System.in);
//	 Hàm nhập hai số a và b
		System.out.println("Nhap va so a: ");
		aNumber = sr.nextInt();
		System.out.println("Nhap vao so b: ");
		bNumber = sr.nextInt();
		System.out.println("Phương trình bạn vừa nhập là:" + aNumber + "x +" + bNumber + "=0");
		
//		Hàm tính toán điều kiện
		if(aNumber == 0 ) {
			if( bNumber ==0) {
				System.out.println("Phuong trinh nay vo so nghiem");
				
			}else {
				System.out.println(" Phuong trinh nay vo nghiem");
			}
		}else {
			Nghiem =(double) -bNumber /aNumber; // ép kiểu để cho kết quả chính xác 
			System.out.println("Phương trình có nghiệm x=" + Nghiem);
		}
	}
	
}
