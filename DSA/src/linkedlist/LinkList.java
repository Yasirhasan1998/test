package linkedlist;

public class LinkList {
	Node head;
	private int size;

	LinkList() {
		this.size = 0;
	}

	public int getSize() {
		return size;
	}

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;// If a variable is declared as a class type, the variable either contains
			size++;     // null or a reference to an object of that class or a subclass of that class.
		}
	}

	// add -first,last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		

	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		// linkedlist traversing
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}		

	public void printList() {
		if (head == null) {
			System.out.println("list  is empty");
			return;
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}

//delet first,last
	public void deleteFirst() {
		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		size--;
		head = head.next;

	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		size--;
		// traversing
		if (head.next == null) {// when one node present in linkedList
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;// head.next=null->lastNode=null
		while (lastNode.next != null) {// null.next=error ajayega
			lastNode = lastNode.next;
			secondLast = secondLast.next;

		}
		secondLast.next = null;

	}
	

	
	public static void main(String[] args) {
		LinkList l = new LinkList();
		l.addFirst("a");
		l.addFirst("is");
		l.addLast("list");

		l.addFirst("this");
		l.printList();

		l.deleteFirst();
		l.printList();

		l.deleteLast();
		l.printList();

		System.out.println(l.getSize());
		l.addFirst("this");
		System.out.println(l.getSize());
		
//		l.addLast("a");
//		l.addLast("is");
//		l.addLast("list");
//
//		l.addLast("this");
//		l.printList();
	}

}
