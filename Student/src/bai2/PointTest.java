package bai2;

public class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point(1,2,3);
		System.out.println(p1);
		System.out.println("Diem doi qua goc:" + p1.negate());
		System.out.println("Khoang cach tu 0 den no:" +p1.getDistance());
	}
}
