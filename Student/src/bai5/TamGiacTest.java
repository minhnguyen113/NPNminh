package bai5;

import java.util.Scanner;

public class TamGiacTest {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		TamGiac tg1 = new TamGiac();
		System.out.print("Nhap canh ma: ");
		int ma = sc.nextInt();
		System.out.print("Nhap canh mb: ");
		int mb = sc.nextInt();
		System.out.print("Nhap canh mc: ");
		int mc= sc.nextInt();	
		
		tg1.setMa(ma);
		tg1.setMb(mb);
		tg1.setMc(mc);
		
		System.out.println("Kieu tam giac: " + tg1.display());
		System.out.println("Chu vi tam giac: " + tg1.ChuVi());
		System.out.println("Dien tich tam giac: " + tg1.DienTich());
		System.out.println(tg1);
		
//		tg1.setMa(ma);
//		tg1.setMb(mb);
//		tg1.setMc(mc);
		
	}
}
