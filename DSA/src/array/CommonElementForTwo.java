package array;

public class CommonElementForTwo {

	public static void main(String[] args) {
		int[] a1 = { 1,2, 3, 5, 6 };
		int[] a2 = { 2, 3, 5, 6, 9 };
//1st approch
//		for (int i = 0; i < a1.length; i++) {
//			for (int j = 0; j < a2.length; j++) {
//				if (a1[i] == a2[j]) {
//					System.out.println(a1[i]);
//				}
//
//			}
//
//		}

		// 2nd approch

		int i = 0;
		int j = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] == a2[j]) {
				System.out.println(a1[i]);

				i++;
				j++;
			} else if (a1[i] < a2[j]) {
				i++;
			} else {
				j++;
			}
		}

	}

}
