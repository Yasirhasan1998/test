package array;

public class InseertElemnt {

	public static void main(String[] args) {
		int[] a = { 2, 34, 5, 6, 9, 7 };

		int pos = 3;
		int x = 23;

		for (int i = a.length - 1; i > pos - 1; i--) {
			a[i] = a[i - 1];
		}
		a[pos - 1] = x;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}

}
