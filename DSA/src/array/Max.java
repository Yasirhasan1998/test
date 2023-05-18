package array;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		int[] a = { 5, 4, 6, 7 };
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("max element is:" + max);

	}
	
}