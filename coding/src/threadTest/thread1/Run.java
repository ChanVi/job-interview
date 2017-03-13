package threadTest.thread1;

//同步代码块取得的对象锁 只在这个对象上起到同步效果
public class Run {

	public static void main(String[] args) {

		Service service = new Service();
		
		ThreadA a = new ThreadA(service);
		a.start();
		ThreadB b = new ThreadB(service);
		b.start();
	}

}
