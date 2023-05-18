package array;

import java.util.Scanner;

public class InsertElement2ndWay {

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
		System.out.println("before insert the element");
		for (int i = 0; i <size; i++) {
			System.out.println(a[i]+",");
		}
		// insert
		System.out.println("enter the element to be insert");
		int x = s.nextInt();
		System.out.println("enter the pos where you are insert");
		int pos = s.nextInt();
		for (int i = size; i > pos; i--) {
			a[i] = a[i - 1];
		}
		a[pos] = x;
		++size;
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]+",");
		}
	}

}
