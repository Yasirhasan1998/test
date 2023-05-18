package linkedlist;

import linkedlist.LinkList.Node;

public class ItreateAndRecursive {
	Node head;
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data=data;
			this.next = null;
		}
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
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
   public void reverseItreat() {
	  if(head==null || head.next==null) {
		return;
	  }
		Node preNode=head;
		Node curNode=head.next;
		while(curNode!=null) {
			Node nextNode=curNode.next;
			curNode.next=preNode;
			
			//update
			preNode=curNode;
			curNode=nextNode;
		}
		head.next=null;
		head=preNode;
	}
   public Node reverseRecursive(Node head) {
	   if(head==null||head.next==null) {
		   return head;
	   }
	   Node newHade=reverseRecursive(head.next);
	   head.next.next=head;
	   head.next=null;
	    return newHade;
   }
	public static void main(String[] args) {
		ItreateAndRecursive l = new ItreateAndRecursive();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);

		l.addLast(4);
		l.printList();
		l.reverseItreat();
		l.printList();
		l.head=l.reverseRecursive(l.head);
		l.printList();


	}

}
