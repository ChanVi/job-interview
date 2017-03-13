package threadTest.thread4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main3 {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private static int count = 0;

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Main3 main = new Main3();
		for (int i = 0; i < 5; i++) {
			executorService.execute(main.new Run1("AAAA", 1));
			executorService.execute(main.new Run1("BBBB", 2));
			executorService.execute(main.new Run1("CCCC", 3));
		}
		executorService.shutdown();
	}

	class Run1 implements Runnable {
		private String name;
		private int threadNum;

		public Run1(String name, int threadNum) {
			this.name = name;
			this.threadNum = threadNum;
		}

		@Override
		public void run() {
			lock.lock();
			while (true) {
				if (count % 3 == threadNum - 1) {
					System.out.println(name);
					count++;
					condition.signalAll();
					break;
				} else {
					try {
						condition.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			lock.unlock();
		}

	}

}
