package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList mylist = new DoublyLinkedList();
		mylist.insertFirst(22);
		mylist.insertFirst(44);
		mylist.insertFirst(66);
		mylist.insertLast(11);
		mylist.insertLast(33);
		mylist.insertLast(55);
		mylist.displayForward();
		mylist.displayBackward();
		mylist.deleteFirst();
		mylist.deleteLast();
		mylist.deleteKey(11);
		mylist.displayForward();
		mylist.insertAfter(22, 77);
		mylist.insertAfter(33, 88);
		mylist.displayForward();
	}

}
