package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode; // if empty, last will refer to the new Node being created
		} else {
			first.previous = newNode;
		}
		
		newNode.next = first; // the new node's next field will point to the old first
		this.first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // assigning old last to newnode
			newNode.previous = last;
		}
		
		last = newNode; // the linkedlist's last field should point to newNode
	}
	
	// assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if(first.next == null) { // there is only one item in the list
			last = null;
		} else {
			first.next.previous = null;
		}
		
		first = first.next;
		return temp; // return deleted old first node
	}
	
	// assume non-empty list
	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) { // there is only one item in the list
			first = null;
		} else {
			last.previous.next = null; 
		}
		
		last = last.previous;
		return temp;
	}
	
	// assume non-empty list
	public boolean insertAfter(int key, int data) {
		Node current = first; // start from beginning of the list
		
		while(current.data != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if (current == last) { // the last node
			current.next = null;
			last = newNode; 
		} else { // not the last node
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	// assume non-empty list
	public Node deleteKey(int key) {
		Node current = first; // start from the beginning
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		
		if (current == first) {
			first = current.next; // make first field point to next node
		} else {
			current.previous.next = current.next; // assign previous node's next node to current next node
		}
		
		if (current == last) {
			last = current.previous; // make last field point to previous node
		} else {
			current.next.previous = current.previous; // assign next node's previous node to current previous node
		}
		
		return current;
	}
	
	public void displayForward() {
		System.out.println("List (first --> last)");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.println("List (last --> first)");
		Node current = last;
		while(current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
}
