package threadTest.thread3;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 extends Thread {
	
	private AtomicInteger atomicInteger = new AtomicInteger(0);
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(atomicInteger.addAndGet(1));
		}
	}

}
