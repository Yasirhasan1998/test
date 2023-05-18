package array;

public class Twodai {

	public static void main(String[] args) {
		int[][] a = { { 1, 7, 4, 8 }, { 8, 9, 4, 5, 8 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+",");
			}
			System.out.println();

		}
	}

}
