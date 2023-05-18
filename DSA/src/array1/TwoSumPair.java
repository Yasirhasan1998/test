package array1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSumPair {

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("pls put the array: ");
//		int a = s.nextInt();
//
//		int[] n = new int[a];
//		for (int i = 0; i < a; i++) {
//			n[i] = s.nextInt();
//		}
//		
//		int target = s.nextInt();
//		s.close();
//
//		int[] twosum = twoSumBruteForce(n, target);
//		if (twosum.length ==2) {
//			System.out.println(twosum[0] + " " + twosum[1]);
//		}
//	   else {
//		   System.out.println("no soution found");  
//	   }
//			
//
//	}
//
//	private static int[] twoSumBruteForce(int[] n, int target) {
//		for (int i = 0; i < n.length; i++) {
//
//			for (int j = i + 1; j < n.length; j++) {
//				if (n[i] + n[j] == target) {
//					return new int[] { i, j };
//				}
//			}
//		}
// 	return new int[] {};
//	}

	// The time complexity of the above solution is O(n) and requires O(n) extra
	// space,
	// where n is the size of the input.
	public static void main(String[] args) {
		int[] a = { 2, 7, 11, 15 };
		int terget = 9;
		findPair(a, terget);
	}

	public static int[] findPair(int[] a, int terget) {
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			// check if pair (a[i], target-a[i]) exists
			// if the difference is seen before, print the pair
			if (m.containsKey(terget - a[i])) {
				System.out.printf("Pair found (%d, %d)", a[m.get(terget - a[i])], a[i]);
				
				return new int[]{a[m.get(terget - a[i])], a[i]};

			}
			m.put(a[i], i);
		}
		System.out.println("pair not found");
		return new int[]{};
	}
}
