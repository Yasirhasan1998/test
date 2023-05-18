package array1;

import java.util.Arrays;

public class arrayUsingFunction {

	public static void main(String[] args) {

		int[] num = { 3, 4, 54, 66 };
		System.out.println(Arrays.toString(num));
		change(num);
		System.out.println(Arrays.toString(num));
	}
 
	static void change(int[] a) {
		a[0] = 79;

	}

}
