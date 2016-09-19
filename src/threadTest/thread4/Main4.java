package threadTest.thread4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main4 {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Object lock = new Object();
		int count = 0;		
		PrintService service = new PrintService(lock, count);
		Main4 main = new Main4();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Threada("AAAA",1,service));
			executorService.execute(new Threada("BBBB",2,service));
			executorService.execute(new Threada("CCCC",3,service));
		}
		executorService.shutdown();
	}


}
