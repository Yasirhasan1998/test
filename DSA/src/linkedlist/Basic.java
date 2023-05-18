package linkedlist;

public class Basic {
	public static class Node{
    	   int data;
    	   Node next;
    	   Node(int data){
    		   this.data=data;
    	   }
       }
	
	public static void display1(Node head) {
		
		while(head!=null) {//displaying the printing the list 
			System.out.print(head.data+"->");
			head=head.next;
		}
	}
	public static void display(Node head) {//recursive function
		if(head==null)
			return;
		System.out.print(head.data+"->");
		display(head.next);
		System.out.print(head.data+"->");//reverse print
	}
	public static void main(String[] args) {
		Node n=new Node(3);
		Node a=new Node(4);
		Node b=new Node(5);
		Node c=new Node(6);
		
		n.next=a;
		a.next=b;
		b.next=c;
		
		display(n);
		System.out.println();
		display1(n);
		System.out.println();
		display1(n);
		
		

	}

}
