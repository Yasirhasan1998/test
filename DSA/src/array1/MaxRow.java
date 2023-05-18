package array1;
//Given a binary matrix, you have to find the row with the maximum number of 1s.
//
//Example 1:
//
//Input: arr = [[1,1,1],[0,0,0],[0,0,0]], r = 3, c = 3 
//Output: 0
public class MaxRow {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int maxRow = findRowWithMaxOnes(arr);
		System.out.println(maxRow);
	}

	public static int findRowWithMaxOnes(int[][] arr) {
		int maxRow = 0;//-1 for minimum
		int maxOnes = 0;//Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int ones = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					ones++;
				}
			}
			if (ones > maxOnes) {//ones < maxOnes
				maxOnes = ones;
				maxRow = i;
			}
		}
		return maxRow;
	}

}
