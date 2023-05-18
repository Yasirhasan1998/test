package array;

import java.util.Scanner;

public class InsertStringArray {
	public static void main(String[] args) {
		String[] fruit = { "apple", "mango", "banana" };
		System.out.println("new version");
		printFruit(fruit);
		fruit = addFruit(fruit);
	}

	private static void printFruit(String[] fruit) {
		for (int i = 0; i < fruit.length; i++) {
			System.out.println((i + 1) + ") " + fruit[i]);
		}

	}

	private static String[] addFruit(String[] fruit) {

		String[] moreFruits = new String[fruit.length + 1];

		for (int i = 0; i < fruit.length; i++) {
			moreFruits[i] = fruit[i];

		}
		Scanner s = new Scanner(System.in);
		System.out.println("new fruits:");
		moreFruits[moreFruits.length - 1] = s.nextLine();
		return moreFruits;
	}

}
