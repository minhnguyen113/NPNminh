package bai8;

//import java.util.Scanner;

public class RunAccount {
	public static void main(String[] args) {
//		Scanner acc = new Scanner(System.in);
		
		Account acc1 = new Account("Ted Murphy",72345,100000);
		Account acc2 = new Account ("Jane Smith",69713,40000);
		Account acc3 = new Account ("Edward Demsey",93757,700000);
		acc1.napTien(acc1, 2000);
		System.out.println(acc1);
		acc1.rutTien(acc1, 5000);
		System.out.println(acc1);
		acc1.transfer(acc1, acc2, 5000);
		System.out.println(acc1);
	}
}
