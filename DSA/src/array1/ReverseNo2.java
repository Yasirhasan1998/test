package array1;

import java.util.Scanner;

public class ReverseNo2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] a = new int[n];
		for (int i = a.length; i < 0; i++) {
			a[i] = s.nextInt();
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i] + " ");
		}

	}

}
