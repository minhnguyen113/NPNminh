package bai4;

import java.util.Scanner;

public class SinhVienTest {

	public static void main(String[] args) {
		
		SinhVien sv1 = new SinhVien(11111, "Nguyễn Thanh An", 6.5f, 8.5f);
		
		SinhVien sv2 = new SinhVien();
		sv2.setMaSV(22222);
		sv2.setHoTen("Nguyễn Văn Tèo");
		sv2.setDiemLT(7.5f);
		sv2.setDiemTH(8.0f);
		
		SinhVien sv3 = new SinhVien();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã số của sinh viên sv3: ");
		int masv = sc.nextInt();
		System.out.println("Nhập họ và tên của sinh viên sv3: ");
		
		sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemlt = sc.nextFloat();
		System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemth = sc.nextFloat();
		
		sv3 = new SinhVien(masv, hoten, diemlt, diemth);
		
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
		}
}
		
		


	


