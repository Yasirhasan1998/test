package array1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverrseNo {

	public static void main(String[] args) {
		int[] a = { 23, 45, 6, 78, 3, 88 };

		reverse(a);
		System.out.println(Arrays.toString(a));
		
	}

	static void reverse(int[] a) {
		int start = 0;
		int end = a.length-1;;
		while (start < end) {//here index value is 0,1,2,3,....
			swap(a, start, end);
			start++;
			end--;
		}

	}

	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

}
