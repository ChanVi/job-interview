package threadTest.thread4;

public class Threada implements Runnable {
	private String name;
	private int threadNum;
	private PrintService service;

	public Threada(String name, int threadNum, PrintService service) {
		this.name = name;
		this.threadNum = threadNum;
		this.service = service;
	}

	@Override
	public void run() {
		service.printService(name, threadNum);
	}

}
