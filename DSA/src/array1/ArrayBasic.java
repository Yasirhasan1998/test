package array1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		// datatype[] veriable_name=new data_type[size];
		// int[] arr = new int[9];
		// | |
		// store in stack {7,8,9,8,6}-each ele are object this ele store in heap memory
		// int[] ar= {3,4,5};
		// int[] arr=new int[9];

		Scanner s = new Scanner(System.in);
		System.out.print("enter the no of array: ");
		int n = s.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i : a) {
			System.out.print(i+ ",");
		}
		System.out.println(Arrays.toString(a));
	}

}
