package array;

public class Find2ndLargestAndSmallest2ndWAy {

	public static void main(String[] args) {
		int[] a = { 6, 4, 3, 7, 8, 9 };
		int largest = Integer.MIN_VALUE;// Integer.MAX_VALUE//int-min=-2147483647,int-max=2147483647
		int second_largest = Integer.MIN_VALUE;// Integer.MAX_VALUE

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {// a[i] < largest

				second_largest = largest;
				largest = a[i];

			} else if (a[i] > second_largest && a[i] != largest) {// a[i] < second_largest && a[i] != largest
				second_largest = a[i];
			}
		}
		if (second_largest == Integer.MIN_VALUE) {
			System.out.println("there is no second element in the list:");
		} else {
			System.out.println("second largest vlaue is" + second_largest);
		}

	}

}
