package array;

public class SibgleRepit {

	public static void main(String[] args) {
		int[] a = {  2, 3, 2, 3, 5, 5,7, 8, 8 };

		int res = a[0];

		for (int i = 1; i < a.length; i++) {
			res = res ^ a[i];
		}
		System.out.println("single no is " + res);
	}

}
