package threadTest.thread;

/**
 * 优先级高并不表示一定先完成
 */
public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.setPriority(Thread.NORM_PRIORITY-3);
		threadB.setPriority(Thread.NORM_PRIORITY+5);
		threadA.start();
		threadB.start();
		Thread.sleep(1000);
		threadA.stop();
		threadB.stop();
		System.out.println("ThreadA :"+threadA.getCount());
		System.out.println("ThreadB :"+threadB.getCount());
	}

}
