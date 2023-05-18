package searching;

public class LinearSerchForString {

	public static void main(String[] args) {
		String[] a = { "yas", "ram", "pol", "jodu" };

		String item = "ram";
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(item)) {
				System.out.println("item is present at possition: " + i);
				temp=temp+1;
			}
		}
		if (temp == 0) {
			System.out.println("item is not present");

		}

	}

}
