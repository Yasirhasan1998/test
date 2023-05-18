package searching;

public class FloorBinarySearch {

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 9, 14, 16, 18 };

		int target = 15;
		System.out.print(floor(a, target));

	}

	// gretest n<=target
	static int floor(int[] a, int target) {
		

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
		return end;

	}

}
