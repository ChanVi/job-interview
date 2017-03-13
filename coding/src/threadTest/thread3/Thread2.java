package threadTest.thread3;


public class Thread2 extends Thread {
	
	private ThreadService threadService;
	
	public Thread2(ThreadService threadService) {
		this.threadService = threadService;
	}

	@Override
	public void run() {
		threadService.add();
	}

}
