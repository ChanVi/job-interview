package threadTest.thread;

//suspend 缺点 独占锁
public class TestMyThread1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 thread = new MyThread1();
		thread.start();
		Thread.sleep(1000);
		thread.suspend();
		System.out.println("main end");
	}

}
