package Test;

import java.util.Scanner;

public class TimUSCLN {
	public static void main(String[] args) {
		int aNumber , bNumber;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Nhap vao so a :");
		aNumber = sc.nextInt();
		System.out.println(" Nhap vao so b:");
		bNumber = sc.nextInt();
		

		
		System.out.println("Ước chung lớn nhất của " + aNumber + " và " + bNumber + " là: " + USCLN(aNumber,bNumber));
		
	}
	public static int USCLN(int aNumber, int bNumber) {
		if( bNumber ==0) return aNumber;
		return USCLN(bNumber , aNumber % bNumber);
	}
}
