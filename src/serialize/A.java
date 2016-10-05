package serialize;

import java.io.Serializable;

public class A implements Serializable{
	private int a;
	static private  int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}
