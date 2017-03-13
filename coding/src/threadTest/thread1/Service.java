package threadTest.thread1;

public class Service {
	private String anString = new String();
	
	public void a(){
		try {
			synchronized (this) {
				System.out.println("a begin ");
				Thread.sleep(1000);
				System.out.println("a end");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void b(){
		System.out.println("b begin");
		System.out.println("b end");
	}
}
