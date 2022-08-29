package bai3;

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder s1 = new Cylinder(2,2);
		System.out.println(s1);
		System.out.println("Dien tich xung quanh:" + s1.SXungQuanh());
		System.out.println("Dien tich toan phan:" +s1.SToanPhan());
		System.out.println("The tich:" +s1.TheTich());
	}
}
