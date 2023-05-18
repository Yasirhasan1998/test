package array;

public class ThreeDaimen {

	public static void main(String[] args) {
		int[][][] a = { { { 3, 4, 6, 8 }, { 3, 4, 5, 2 }, { 9, 7, 6, 5 } } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int n = 0; n < a[i][j].length; n++) {
					System.out.print(a[i][j][n] + ",");
				}
				System.out.println();
			}
		}

	}

}
