package array1;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] a = { 23, 45, 6, 78, 3, 88 };

		System.out.println(maxRange(a, 1, 4));
		System.out.println(max(a));

	}
//max range between
	static int maxRange(int[] a, int start, int end) {
		int maxVal = a[start];
		for (int i = start; i < end; i++) {
			if (a[i] > maxVal) {
				maxVal = a[i];
			}
		}
		return maxVal;
	}

	static int max(int[] a) {
		int maxVal = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxVal) {//for min-if (a[i] > maxVal) 
				maxVal = a[i];
			}
		}
		return maxVal;
	}

}
