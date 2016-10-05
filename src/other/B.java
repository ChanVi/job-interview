package other;

class A {
	
	public static String name() {
		return "A";
	}
	
}

public class B extends A{
	
	public static String name() {
		return "B";
	}
	
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		System.out.println(a.name());
		System.out.println(b.name());
	}

}
