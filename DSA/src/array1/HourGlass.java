package array1;

import java.util.Scanner;

public class HourGlass {

	static int row;
	static int col;


	static int findMaxSum(int[][] mat) {

		// Here loop runs (R-2)*(C-2)
		// times considering different
		// top left cells of hour glasses.
		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i < row - 2; i++) {
			for (int j = 0; j < col - 2; j++) {
				
				int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) + (mat[i + 1][j + 1])
						+ (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);

				max_sum = Math.max(max_sum, sum);
			}
		}
		return max_sum;
	}

	// Driver code
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int row = scan.nextInt();

		System.out.print("Enter the number of columns: ");
		int col = scan.nextInt();

		int[][] mat = new int[row][col];
		System.out.println("Enter the elements of the Matrix: ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		int res = findMaxSum(mat);
		System.out.println("Maximum sum of hour glass = " + res);
	}

}