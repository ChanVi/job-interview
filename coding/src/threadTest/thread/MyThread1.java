package threadTest.thread;

public class MyThread1 extends Thread {

	private int i = 0;

	public int getI() {
		return i;
	}

	@Override
	public void run() {
		while(true){
			i++;
			
			//System.out.println(i);
		}
	}

}
