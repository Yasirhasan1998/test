package searching;

public class CellingBinarySearch {

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 9, 14, 16, 18 };

		int target = 17;
		System.out.print(celing(a, target));

	}

	// return index is smallest n>=target
	static int celing(int[] a, int target) {
		// if the target greter than the greatest nb in the array
				if (target > a[a.length - 1]) {
					return -1;
				}

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			// int mi=atart+end/2; might be possible that (start+end) exceeds the range of
			// integer in java
			int mi = start + (end - start) / 2;
			if (a[mi] == target) {
				return mi;

			} else if (a[mi] < target) {
				start = mi + 1;
			} else {
				end = mi - 1;
			}

		}
		return start;

	}

}
