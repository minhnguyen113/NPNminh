package bai1;

public class ToaDo {
	private String ten;
	private int x;
	private int y;
	
	public ToaDo() {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "ToaDo [x=" + x + ", y=" + y + ", ten=" + ten + "]";
	}

	
	
	
	
}
