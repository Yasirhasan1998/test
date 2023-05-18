package array;

import java.util.ArrayList;

public class EvenAndOdd {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 56, 7, 8, 9 };
		int total1 = 0;
		int total2 = 0;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a1.add(a[i]);
			} else {
				a2.add(a[i]);
			}
		}

		System.out.println("even no are :");
		for (int n : a1) {

			total1 = total1 + n;
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("even no size is " + a1.size());

		System.out.println("total even no sum :" + total1);

		System.out.println();

		System.out.println("odd no is:");
		for (int n : a2) {

			total2 = total2 + n;
			System.out.print(n + " ");
		} 
		System.out.println();
		System.out.println("odd no size is " + a2.size());

		System.out.println("total odd no sum " + total2);

	}

}
