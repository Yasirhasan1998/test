package array1;

public class IntervalArray {

	public static void main(String[] args) {
		int[] interval = { 1, 5 };
		// output=15

		System.out.println(countIntervals(interval));

	}

	public static int countIntervals(int[] interval) {
		int sum = 0;
		int start = interval[0];
		int end = interval[1];
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;

	}

}
