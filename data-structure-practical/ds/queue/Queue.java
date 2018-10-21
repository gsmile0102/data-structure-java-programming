package ds.queue;

public class Queue {
	
	private int maxSize; // initialize the set number of sizes
	private long[] queArray; // slots to main the data
	private int front; // index position for the element in the front
	private int rear; // index position for the element at the back
	private int nItems; // counter to maintain the number of items in queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0; // index position of the first slot of array
		rear = -1; // there is no item in array yet to be considered as the last item
		nItems = 0; // don't have element in array yet
	}
	
	public void insert(long j) {
		if (rear == maxSize-1) {  // circular queue
			rear = -1;
		} 
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	
	public long remove() {
		long temp = queArray[front];
		front++;
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void view() {
		System.out.print("[");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.print("]");
	}
}
