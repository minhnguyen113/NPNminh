package bai1;

import java.util.Scanner;

public class ToaDoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ToaDo s1 = new ToaDo();
		System.out.println("Nhap ten:");
		String ten = sc.nextLine();
		System.out.println("Nhap toa do x:");
		int x = sc.nextInt();
		System.out.println("Nhap tao do y:");
		int y= sc.nextInt();
		
		s1.setX(x);
		s1.setY(y);
		s1.setTen(ten);
		System.out.println(s1);
	}
}
