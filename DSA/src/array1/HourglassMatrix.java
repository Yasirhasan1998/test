package array1;

import java.util.Scanner;

// Example 1:
// Let Rows = 5
// Columns = 5
// Matrix is:
// 1  2  4  5  6
// 7  5  2  3  6
// 0  0  0  0  0
// 7  5  1  3  5
// 0  0  0  0  0
//
// All the possible hourglass in this Matrix are:
// 1 2 4    2 4 5    4 5 6
//   5        2        3
// 0 0 0    0 0 0    0 0 0
//
// 7 5 2    5 2 3    2 3 6
//   0        0        0
// 7 5 1    5 1 3    1 3 5
//
// 0 0 0    0 0 0    0 0 0
//   5        1        3
// 0 0 0    0 0 0    0 0 0
// 
// The maximum sum subset values ( hourglass ) in this is :
//
// 7 5 2
//   0
// 7 5 1
// Where in the sum is 27.
public class HourglassMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = scan.nextInt();

		System.out.print("Enter the number of columns: ");
		int columns = scan.nextInt();

		int[][] matrix = new int[rows][columns];
		System.out.println("Enter the elements of the Matrix: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		scan.close();
		int sum = 0;

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < rows - 2; i++) {
			for (int j = 0; j < columns - 2; j++) {
				sum = (matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]) + (matrix[i + 1][j + 1])
						+ (matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2]);

				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println("The maximum sum in the hourglass is: " + max);
		
		
	}
}
