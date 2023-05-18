package array1;

import java.util.Arrays;
import java.util.Scanner;

public class SwapeArrayEle {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int[] a = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = s.nextInt();
//		}
//		for (int i : a) {
//			System.out.println(Arrays.toString(a));
//		}
		
		int[] a= {23,45,6,78,3,88};
		
		swap(a, 0, 2);
		System.out.println(Arrays.toString(a));
	}

	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

}
