package string;

public class RapperClass {
	static int arr[] = { 1, 5 };

	public static void main(String[] args) {

		System.out.println("Sum of given array is " + sumRange(arr));
	}

	public static int sumRange(int[] arr) {
		int sum = 0;
		
		for (int a:arr) {
			sum = sum + a;
		}
		return sum;
	}
}
