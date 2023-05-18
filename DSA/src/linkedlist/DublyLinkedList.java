package linkedlist;

public class DublyLinkedList {

	Node head;
	Node tail;
	int size;

	public class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}

	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	// insert a node at a given position
	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node curNode = head;
		int pos = 1;
		while (curNode != null && pos < position) {
			curNode = curNode.next;
			pos++;
		}
		if (curNode == null) {
			// position is greater than the length of the list
			System.out.println("Position is greater than the length of the list.");
			return;
		}
		Node prevNode = curNode.prev;
		newNode.prev = prevNode;
		newNode.next = curNode;
		curNode.prev = newNode;
		if (prevNode != null) {
			prevNode.next = newNode;
		} else {
			head = newNode;
		}

	}
	public void deleteNodeAtPosition(int position) {
        if (head == null) {
            return;
        }

        Node current = head;
        if (position == 1) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return;
        }

        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        current.prev.next = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        size--;
	}

	public void traverseDisplay() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		Node cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DublyLinkedList l = new DublyLinkedList();
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insertAtPosition(8, 2);
		l.insertAtPosition(55, 1);
		l.traverseDisplay();
		l.deleteNodeAtPosition(3);
		l.traverseDisplay();
	}

}
