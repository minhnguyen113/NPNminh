package bai3;

public class Cylinder {
	private int r;
	private int h;
	private float pi= (float) 3.14;
	
	public Cylinder() {
		
	}
	public Cylinder( int r, int h) {
		this.r =r;
		this.h =h;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	public float SXungQuanh() {
		return 2 * pi *r *h;
	}
	
	public float SToanPhan() {
		return 2 * pi * r * ( r + h);
	}
	
	public float TheTich() {
		return pi * r* r * h;
	}
	@Override
	public String toString() {
		return "Cylinder [r=" + r + ", h=" + h + ", pi=" + pi + "]";
	}
	
	
}
