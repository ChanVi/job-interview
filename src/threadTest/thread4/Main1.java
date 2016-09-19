package threadTest.thread4;

public class Main1 {

	private static Object lock = new Object();//通过对象锁控制
	private static int count = 0;//控制打印顺序
	
	public static void main(String[] args) {
		Main1 main = new Main1();
		new Thread(main.new Run1("AAAA",1)).start();
		new Thread(main.new Run1("BBBB",2)).start();
		new Thread(main.new Run1("CCCC",3)).start();
		
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
			for (int i = 0; i < 5; i++) {
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

}
