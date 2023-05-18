package array;

public class MissingElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 7};

		int expectedElementNo = a.length + 1;
		int expectedElementTotalSum = expectedElementNo * (expectedElementNo + 1) / 2;

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("missing element is :" + (expectedElementTotalSum - sum));
	}

}
