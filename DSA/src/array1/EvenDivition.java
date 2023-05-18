package array1;
//Given an array of N integers, You can perform the following operation on the array
//if all the elements in the array are even:- Divide each element of the array by 2. 
//Can you find the number of operations you can perform.
//
//Example 1:
//
//Input: arr = [4,64,28,12,28] 
//Output: 2
public class EvenDivition {

	public static void main(String[] args) {
		int[] arr= {4,64,28,12,28};
	System.out.println(findOperations(arr));

	}
	public static int findOperations(int[] arr) {
	    int count = 0;
	    while (isAllEven(arr)) {
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = arr[i] / 2;
	        }
	        count++;
	    }
	    return count;
	}

	public static boolean isAllEven(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] % 2 != 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
