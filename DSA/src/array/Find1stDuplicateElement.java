package array;

public class Find1stDuplicateElement {

	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 6, 3, 4, 5 };

		int temp = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {

					temp = temp + 1;
					System.out.print("1st duplicate elekment is:" + a[j]);
					

				}
			}
			if (temp > 0) {
				break;
			}
		}

	}

}
