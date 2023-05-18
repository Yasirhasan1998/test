package array;

public class DeleteElement {

	public static void main(String[] args) {
		int[] a = { 2, 34, 5, 6, 9, 7 };

		int delete = 34;

		for (int i = 0; i < a.length; i++) {
			if (delete == a[i]) {
				for (int j = i; j < a.length-1; j++) {
					a[j] = a[j + 1];
				}
				break;//Because main for loop ka i++ na kare
			}
		}
		for (int i = 0; i < a.length-1; i++) {//array travesrse
			System.out.println(a[i]);
		}
	}

}
