package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TwoSumUsingMap {

	private static int[] twoSum(int[] n, int terget) {
		HashMap<Integer, Integer> map = new HashMap<>();
		// create hasmap
		for (int i = 0; i < n.length; i++) {
			map.put(n[i], i);
		}
		// searching this element (2 4 5 6 7) here terget==7;
		for (int i = 0; i < n.length; i++) {

			int no = n[i];// 2
			int rem = terget - no;// 5
			if (map.containsKey(rem)) {// if rem are present in the map than we return remno and first index
				int index = map.get(rem);
				if (index == i)
					continue;
				return new int[] { i, index };
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("pls put the array: ");
		int a = s.nextInt();

		int[] n = new int[a];
		for (int i = 0; i < a; i++) {
			n[i] = s.nextInt();
		}
		int terget = s.nextInt();

		System.out.println(Arrays.toString(twoSum(n, terget)) + " ");

	}

}
