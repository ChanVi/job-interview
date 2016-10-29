package DataStructure;

public class QueueArray {

	Object[] a;
	int front;
	int rear;
	public QueueArray() {
		this(10);
	}
	public QueueArray(int size) {
		a = new Object[size];
		front = 0;
		rear = 0;
	}
	
	public boolean enqueue(Object obj){
		if ((rear+1)%a.length == front) {
			return false;
		}
		a[rear] = obj;
		rear = (rear+1)%a.length;
		return true;
	}
	
	public Object dequeue(){
		if (front == rear) {
			return null;
		}
		Object obj = a[front];
		front = (front+1)%a.length;
		return obj;
	}
	
	public static void main(String[] args) {
		QueueArray q = new QueueArray();
		System.out.println(q.enqueue("a"));
		System.out.println(q.enqueue("b"));
		System.out.println(q.enqueue("c"));
		for (int i = 0; i < 3; i++) {
			System.out.println(q.dequeue());
		}
	}

}
