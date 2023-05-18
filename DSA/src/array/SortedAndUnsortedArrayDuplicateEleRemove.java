package array;

import java.util.HashSet;

public class SortedAndUnsortedArrayDuplicateEleRemove {

	public static void main(String[] args) {
		int[] a = {1,3,3,2,2,6,4,4};//{ 1, 2, 2, 3, 3, 5, 6, 6 };

		HashSet<Integer> h = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			h.add(a[i]);
		}
		for (int n : h) {
			System.out.println(n); 
		}

	}

}
