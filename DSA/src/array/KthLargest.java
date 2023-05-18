package array;

public class KthLargest {

	public static void main(String[] args) {
		int[] a = { 4, 12, 6, 78, 9, 5, 34, };

		int temp;
		int k = 3;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {//a[i]>a[j] for smallest element

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
			if (i == k - 1) {
				System.out.println(k + " largest element is " + a[i]);
				break;
			}
		}
		System.out.println("-------------");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
