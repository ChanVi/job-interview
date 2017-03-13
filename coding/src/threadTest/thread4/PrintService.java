package threadTest.thread4;

public class PrintService {
	private Object lock;
	private int count;

	public PrintService(Object lock, int count) {
		this.lock = lock;
		this.count = count;
	}

	public void printService(String name, int threadNum) {
		synchronized (lock) {
			while (true) {
				if (count % 3 == threadNum - 1) {
					System.out.println(name);
					count++;
					lock.notifyAll();
					break;
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
