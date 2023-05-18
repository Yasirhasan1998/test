package array;

import java.util.HashSet;

public class Find1stDuplicateElementBySetInterface {

	public static void main(String[] args) {
		int[] a = { 1, 4, 3, 2, 5, 3, 4 };

		int temp = 1;

		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = a.length - 1; i > 0; i--) {
			if (h.contains(a[i])) {
				temp = i;
			} else {
				h.add(a[i]);
			}
		}
		if (temp != -1) {
			System.out.println("1st duplicate no:" + a[temp]);
		} else {
			System.out.println("duplicate no not found");
		}

	}

}
