package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(14);
		myQueue.insert(12);
		myQueue.insert(44);
		myQueue.insert(33);
		myQueue.insert(11);
		myQueue.insert(222);
		myQueue.insert(88);
		myQueue.insert(99);
		myQueue.remove();
		myQueue.view();
	}

}
