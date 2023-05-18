package linkedlist;

public class CircularLinkedList {
	Node head;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Method to insert a node at the end of the list
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			Node cur = head;
			while (cur.next != head) {
				cur = cur.next;
			}
			cur.next = newNode;
			newNode.next = head;
		}
	}
	 public void insertAtStart(int data) {
		 Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				newNode.next = head;
			} else {
				Node cur = head;
				while (cur.next != head) {
					cur = cur.next;
				}
				cur.next = newNode;
				newNode.next = head;
				head=newNode;
			}
	 }

	// Method to traverse the list and print its elements
	public void traverse() {
		if (head == null) {
			System.out.println("list is empty");
			return;

		}
		Node cur = head;
		do {
			System.out.print(cur.data + " ");
			cur = cur.next;
		} while (cur != head);
		System.out.println();
	}
// delete first
	public void DeleteFirst() {
		Node previous=head ,firstNode = head;
		if (head == null)
	    {
	        System.out.printf("\nList is empty\n");
	        return;
	    }
		if (previous.next == previous)
	    {
	        head = null;
	        return;
	    }
		while (previous.next != head)
	    {
	        previous = previous.next;
	    }
		previous.next = firstNode.next;
		 
	    // Make second node as head node
	    head = previous.next;
	   
	    return;
	}
	public Node  DeleteLast()
	{
	    Node current = head,  previous = null;
	  
	    if (head == null)
	    {
	        System.out.printf("\nList is empty\n");
	        return null ;
	    }
	  
	    // Check if list have single node
	    // if yes then delete it and return
	    if (current.next == current)
	    {
	        head = null;
	        return null;
	    }
	  
	    // Move first node to last
	    // previous
	    while (current.next != head)
	    {
	        previous = current;
	        current = current.next;
	    }
	  
	    previous.next = current.next;
	    head = previous.next;
	      
	    return head;
	}
	 
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertAtStart(4);
		list.insert(8);
		list.traverse();
		list.DeleteFirst();
		list.traverse();
		list.DeleteLast();
		list.traverse();
	}

}
