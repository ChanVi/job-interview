package threadTest.thread3;

public class Run2 {

	public static void main(String[] args) {
		ThreadService threadService = new ThreadService();
		for (int i = 0; i < 5; i++) {
			new Thread2(threadService).start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
