package searching;

public class LinearSerch {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 8 };

		int item = 7;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == item) {
				System.out.println("item is present at  index position:" + i);
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("item is not present");
		}

	}

}
