package array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementBySetInterface {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 3, 2, 3, 5,5, 8, 8 };
		Set<Integer> s = new HashSet<Integer>();
		for (int n : a) {
			if (s.add(n) == false) {
				System.out.print(n + " ");
			}
		}

	}

}
