package array;

import java.util.Scanner;

public class DeleteElement2ndway {

	public static void main(String[] args) {
		int capacity = 20;
		int[] a = new int[20];

		Scanner s = new Scanner(System.in);

		System.out.println("enter the size of array ");
		int size = s.nextInt();
		System.out.println("enter the array element");
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("before delete the element");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + ",");
		}
		
		System.out.println("enter the pos where you are delete");
		int pos = s.nextInt();
		for (int i = pos; i < size; i++) {
			a[i] = a[i + 1];
		}
		--size;
		System.out.println("delete after array");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + ",");
		}
	}

}
