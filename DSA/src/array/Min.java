package array;

public class Min {

	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 6 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("minimum element is:" + min);

	}

}
