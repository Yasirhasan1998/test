package array1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Threedimention {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] a = new int[3][2];

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = s.nextInt();
			}
		}
//		for (int row = 0; row < a.length; row++) {
//			System.out.println(Arrays.toString(a[row]));
//		}
		for (int[] row : a) {
			System.out.println(Arrays.toString(row));
		}

	}

}
