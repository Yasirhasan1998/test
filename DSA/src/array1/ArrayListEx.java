package array1;

import java.util.*;


public class ArrayListEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the no: ");
		ArrayList<Integer> list = new ArrayList<>();

//		list.add(34);
//		list.add(325);
//		list.add(435);
//		list.add(43);
//		list.add(4556);
//		list.add(4554);
//		System.out.println(list.contains(43));
//		System.out.println(list);
//		
//		list.set(2, 98);
//		System.out.println(list);
//		
//		list.remove(3);
//		System.out.println(list);

		for (int i = 0; i < 5; i++) {
			list.add(s.nextInt());
	    }
		
		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i)+",");
		}
		list.remove(0);
		System.out.println(list);
		
		list.set(1, s.nextInt());
		System.out.println(list);
	}

}
