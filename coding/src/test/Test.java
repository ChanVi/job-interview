package test;

public class Test extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("run");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.run();
		System.out.print("main");
	}
}
