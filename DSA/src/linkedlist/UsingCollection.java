package linkedlist;

import java.util.*;

public class UsingCollection {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		l.addFirst("a");
		l.addFirst("is");
		l.addFirst("this");
		l.addLast("list");
		System.out.println(l);
		System.out.println(l.size());
		
		for (int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+"->");
			
		}System.out.println("null");
		
		l.removeFirst();
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
	}

}
