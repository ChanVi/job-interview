package threadTest.thread3;

public class Run1 {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread t1 = new Thread(thread1);
		t1.start();
		Thread t2 = new Thread(thread1);
		t2.start();
	}

}
