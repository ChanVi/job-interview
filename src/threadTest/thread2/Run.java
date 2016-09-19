package threadTest.thread2;

public class Run {

	public static void main(String[] args) {
		Service service1 = new Service();
		Service service2 = new Service();
		
		ThreadA threadA = new ThreadA(service1);
		threadA.start();
		ThreadB threadB = new ThreadB(service2);
		threadB.start();
//		ThreadC threadC = new ThreadC(service);
//		threadC.start();
	}

}
