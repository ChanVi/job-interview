package other;
class Test{
	public Test(){
		System.out.println("Test");
	}
}
class Test2{
	public Test2(){
		System.out.println("Test2");
	}
}
class Y {
	int  a=2;
	public Y(){
		System.out.println("Y");
	}
	
	Test test = new Test();

	{System.out.println(a); }
	
	static{
		Test2 test2=new Test2();
	}
}

public class X extends Y{

	public X(){
		System.out.println("X");
	}
	public static void main(String[] args) {
		X x = new X();
		
	}


}
	
