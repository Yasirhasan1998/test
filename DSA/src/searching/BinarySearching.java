package searching;

public class BinarySearching {

	public static void main(String[] args) {
		int[] a = { -88, 2, 3, 4, 5, 6, 12, 13, 14, 15 };

		int terget = 14;
		System.out.print(binaraySearch(a, terget));

	}

	static int binaraySearch(int[] a, int terget) {

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			// int mi=atart+end/2; might be possible that (start+end) exceeds the range of
			// integer in java
			int mi = start + (end - start) / 2;
			if (a[mi] == terget) {
				return mi;

			} else if (a[mi] < terget) {
				start = mi + 1;
			} else {
				end = mi - 1;
			}

		}
		return -1;

	}

}
