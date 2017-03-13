package threadTest.thread2;

public class Service {
	
	synchronized public static void printA(){
		System.out.println("A begin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("A end");
	}
	
	synchronized public static void printB(){
		System.out.println("B begin");
		System.out.println("B end");
	}
	
	synchronized public void printC(){
		System.out.println("C begin");
		System.out.println("C end");
	}
}
