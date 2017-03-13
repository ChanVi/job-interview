package threadTest.thread4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

	private static Object lock = new Object();
	private static int count = 0;
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Main2 main = new Main2();
		for (int i = 0; i < 5; i++) {
			executorService.execute(main.new Run1("AAAA",1));
			executorService.execute(main.new Run1("BBBB",2));
			executorService.execute(main.new Run1("CCCC",3));
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
				synchronized (lock) {
					while(true){
						if(count %3 == threadNum - 1){
							System.out.println(name);
							count++;
							lock.notifyAll();
							break;
						}else {
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

}
