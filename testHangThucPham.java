package baiHangThucPham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class testHangThucPham {
	static Scanner  sc = new Scanner(System.in);
	public static hangThucPham inPut() {
		System.out.println("Ma TP: ");
		String maHang = sc.next();
		System.out.println(" Ten TP: ");
		String tenHang = sc.next();
		System.out.println("Gia TP: ");
		double donGia = sc.nextDouble();
		System.out.println("Ngay san xuat: ");
		String nsxtp1=sc.next();
		System.out.print("Ngay het han: ");
		String nhhtp1=sc.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateNSXtp1=LocalDate.parse(nsxtp1, formatter);
		LocalDate dateNHHtp1=LocalDate.parse(nhhtp1, formatter);
		hangThucPham tp= new hangThucPham(maHang, tenHang, donGia, dateNSXtp1,dateNHHtp1);
		return tp;
}
		public static void main(String[] args) {
			hangThucPham tp1, tp2;
			System.out.println("Nhap tp1");
			tp1=inPut();
			System.out.println("MaHang\t\tTenHang\t\tGia\t\tNgaySX\t\t\tNgayHH\t\t\tGhiChu");
			System.out.println(tp1);	
		}
	}
