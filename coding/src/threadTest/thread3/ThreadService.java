package threadTest.thread3;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadService {
	
	private AtomicInteger atomicInteger = new AtomicInteger(0);
	
	public void add(){
		for (int i = 0; i < 100; i++) {
			System.out.println(atomicInteger.addAndGet(10));
		}
		System.out.println(atomicInteger.addAndGet(1));
	}
}
