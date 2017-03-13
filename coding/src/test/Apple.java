package test;

import java.awt.print.Printable;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

class Fruit {
	static{
		System.out.println("static: Fruit.");
	}
	
	public Fruit() {
		System.out.println("Fruit's constructor.");
	}
	
	public Fruit(int i) {
		System.out.println("Fruit's constructor."+i);
	}
	
	{
		System.out.println("Fruit.");
	}
	
	public void pri(){
		System.out.println("this is fruit.");
	}
}

public class Apple extends Fruit{
	
	
	static{
		System.out.println("static: Apple.");
	}
	
	public Apple() {
		System.out.println("Apple's constructor.");
	}
	
	public Apple(int i) {
		System.out.println("Apple's constructor."+i);
	}
	
	{
		System.out.println("Apple.");
	}
	
	public void pri(){
		System.out.println("this is Apple.");
	}
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i!=j) {
					for (int k = 1; k <= 4; k++) {
						if (i != j && j != k && i!=k) {
							System.out.println(""+i+j+k);
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
