package searching;

public class UnOrderAndSortedSearch {

	public static void main(String[] args) {
		int[] ar = { 4, 5, 6, 55, 22, 7 };
		int key = 6;
		int un = unsortedLinearSearch(ar, key);
		System.out.println(un);

	}

	public static int unsortedLinearSearch(int[] ar, int value) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == value) {
				return i;
			}
			else if(ar[i]>value)//sorted array
				return-1;
		}
		return -1;
	}

}
