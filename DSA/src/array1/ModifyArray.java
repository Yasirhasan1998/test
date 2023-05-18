package array1;

import java.util.Arrays;

//Write a program that takes in a array of integers and replaces all even numbersw 
//ith 0 and all odd numbers with 1. The function should return 
//a new array with the modified values.
//
//Example 1:
//
//Input: arr =  [1, 2, 3, 4, 5] 
//Output: [1, 0, 1, 0, 1]
public class ModifyArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] modify = modifyArray(a);
		System.out.println(Arrays.toString(modify));
	}

	public static int[] modifyArray(int[] a) {
		int[] modify = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				modify[i] = 0;
			} else {
				modify[i] = 1;
			}
		}
		return modify;

	}

}
